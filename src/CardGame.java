package pairscardgame;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.*;


public class CardGame extends JFrame {

   
    static Timer timerForPlacing, timerForMoving;
    int Y = 10,
            X = 50,
            Cards = 0;
    boolean Click = true;
    Card selectedCard = null;
    JLabel lblBg = new JLabel(new ImageIcon("backkground.jpg"));

  
    void shuffle(Card[] arr) {
        Collections.shuffle(Arrays.asList(arr));
    }

  
    void placeCards(int num, Card[] cards) {
        for (int i = 1; i <= num; i++) {
            placeCardsAux(cards[i - 1], Y += 100, X);
            if (i % 4 == 0) {
                X += 100;
                Y = 10;
            }
        }
    }

    void placeCardsAux(Card card, int x, int y) {

        ActionListener timerAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean boolX = false, boolY = false;

             
                if (card.getX() < x) {
                    card.setLocation(card.getX() + 1, card.getY());
                } else if (card.getX() > x) {
                    card.setLocation(card.getX() - 1, card.getY());
                } else {
                    boolX = true;
                }
                if (card.getY() < y) {
                    card.setLocation(card.getX(), card.getY() + 1);
                } else if (card.getY() > y) {
                    card.setLocation(card.getX(), card.getY() - 1);
                } else {
                    boolY = true;
                }

                if (boolX || boolY) {
                    return;
                }
            }
        };
        timerForPlacing = new Timer(0, null);
        timerForPlacing.addActionListener(timerAction);
        timerForPlacing.start();
    }

    CardGame(int num) {
       Cards = 0;
        lblBg.setBounds(0, 0, 1000, 500);


     
        this.setLayout(null);

     
        JLabel lblText = new JLabel("네모클릭 = 게임시작");
        lblText.setForeground(Color.ORANGE);
        lblText.setFont(new Font("Freestyle Script", Font.PLAIN, 40));
        lblText.setBounds(200, 50, 500, 40);
        add(lblText);
        

        Card[] cards = new Card[num];

       
        for (int i = 1; i <= num; i++) {
            cards[i - 1] = new Card(new ImageIcon(i + ".jpg"), i);
            cards[i - 1].setBounds(30 - i / 2, i + 320, 100, 90);
            add(cards[i - 1]);
        }

        shuffle(cards);

        for (int i = 1; i <= num; i++) {
            final int selectedCardNum = i - 1;

            cards[i - 1].addMouseListener(new MouseListener() {

                @Override
                public void mouseClicked(MouseEvent e) {

                    if (Click) {
                        placeCards(num, cards);
                        lblText.show(false);
                        Click = false;

                    } else {

                        cards[selectedCardNum].flip();
                        if (selectedCard == null) {
                            selectedCard = cards[selectedCardNum];

                        } else if (selectedCard == cards[selectedCardNum]) {
                            JOptionPane.showMessageDialog(rootPane, "다른 카드를 선택해요");
                            selectedCard = null;
                        } else if ((selectedCard.id - cards[selectedCardNum].id == 1
                                && Math.max(cards[selectedCardNum].id, selectedCard.id) % 2 == 0)
                                || (selectedCard.id - cards[selectedCardNum].id == -1
                                && Math.min(cards[selectedCardNum].id, selectedCard.id) % 2 != 0)) {
                            Cards += 2;

                            selectedCard.removeMouseListener(selectedCard.getMouseListeners()[0]);
                            cards[selectedCardNum].removeMouseListener(cards[selectedCardNum].getMouseListeners()[0]);

                            selectedCard.removeMouseListener(this);
                            cards[selectedCardNum].removeMouseListener(this);
                            selectedCard = null;

                            if (num == Cards) {
                                JFrame WinFrame = new JFrame();
                                WinFrame.pack();
                                WinFrame.setSize(400, 200);
                                WinFrame.setTitle("승리");
                                WinFrame.setLocationRelativeTo(null);
                                WinFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                JLabel lblwin = new JLabel(new ImageIcon("WIN.jpg"));
                                WinFrame.setLayout(new BorderLayout());
                                JButton b1 = new JButton("확인");
                                b1.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        WinFrame.hide();
                                    }
                                });
                                WinFrame.add(lblwin, BorderLayout.CENTER);
                                WinFrame.add(b1, BorderLayout.SOUTH);
                                WinFrame.setVisible(true);
                            }
                        } else {
                            Timer timetoflip = new Timer(800, new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent es) {
                                    cards[selectedCardNum].flip();
                                    selectedCard.flip();
                                    selectedCard = null;

                                }
                            });
                            timetoflip.setRepeats(false);
                            timetoflip.start();
                        }
                    }
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }

            });

        }

        add(lblBg);
    }
}