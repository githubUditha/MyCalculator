package calculatorproject;

import static java.awt.SystemColor.text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI extends javax.swing.JFrame {
    
    int length,point=0,operation=0;
    String text,operator;
    double operand1, operand2, answer;

    public CalculatorUI() {
        initComponents();
        Display.setText("0");
    }
    
    public void storeOperand1() {
        text = Display.getText();
        length = text.length();
        operand1 = Double.parseDouble(text);
    }
    
    public void storeOperand2() {
        text = Display.getText();
        operand2 = Double.parseDouble(text.substring(length + 3, text.length()));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Display = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        AllClear = new javax.swing.JButton();
        Div = new javax.swing.JButton();
        Mul = new javax.swing.JButton();
        No7 = new javax.swing.JButton();
        No8 = new javax.swing.JButton();
        No9 = new javax.swing.JButton();
        No4 = new javax.swing.JButton();
        No5 = new javax.swing.JButton();
        No6 = new javax.swing.JButton();
        No1 = new javax.swing.JButton();
        No2 = new javax.swing.JButton();
        No3 = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Sub = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Equal = new javax.swing.JButton();
        No00 = new javax.swing.JButton();
        No0 = new javax.swing.JButton();
        Point = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        Display.setEditable(false);
        Display.setBackground(new java.awt.Color(0, 0, 0));
        Display.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Display.setForeground(new java.awt.Color(255, 255, 255));
        Display.setMargin(new java.awt.Insets(2, 50, 2, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        AllClear.setBackground(new java.awt.Color(204, 255, 255));
        AllClear.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        AllClear.setText("AC");
        AllClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AllClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllClearActionPerformed(evt);
            }
        });

        Div.setBackground(new java.awt.Color(204, 255, 255));
        Div.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Div.setText("/");
        Div.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivActionPerformed(evt);
            }
        });

        Mul.setBackground(new java.awt.Color(204, 255, 255));
        Mul.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Mul.setText("X");
        Mul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MulActionPerformed(evt);
            }
        });

        No7.setBackground(new java.awt.Color(204, 255, 255));
        No7.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        No7.setText("7");
        No7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        No7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No7ActionPerformed(evt);
            }
        });

        No8.setBackground(new java.awt.Color(204, 255, 255));
        No8.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        No8.setText("8");
        No8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        No8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No8ActionPerformed(evt);
            }
        });

        No9.setBackground(new java.awt.Color(204, 255, 255));
        No9.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        No9.setText("9");
        No9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        No9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No9ActionPerformed(evt);
            }
        });

        No4.setBackground(new java.awt.Color(204, 255, 255));
        No4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        No4.setText("4");
        No4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        No4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No4ActionPerformed(evt);
            }
        });

        No5.setBackground(new java.awt.Color(204, 255, 255));
        No5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        No5.setText("5");
        No5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        No5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No5ActionPerformed(evt);
            }
        });

        No6.setBackground(new java.awt.Color(204, 255, 255));
        No6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        No6.setText("6");
        No6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        No6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No6ActionPerformed(evt);
            }
        });

        No1.setBackground(new java.awt.Color(204, 255, 255));
        No1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        No1.setText("1");
        No1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        No1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                No1MouseClicked(evt);
            }
        });

        No2.setBackground(new java.awt.Color(204, 255, 255));
        No2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        No2.setText("2");
        No2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        No2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No2ActionPerformed(evt);
            }
        });

        No3.setBackground(new java.awt.Color(204, 255, 255));
        No3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        No3.setText("3");
        No3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        No3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No3ActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Delete.setText("DEL");
        Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Sub.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Sub.setText("-");
        Sub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Add.setText("+");
        Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Equal.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Equal.setText("=");
        Equal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualActionPerformed(evt);
            }
        });

        No00.setBackground(new java.awt.Color(204, 255, 255));
        No00.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        No00.setText("00");
        No00.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        No00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No00ActionPerformed(evt);
            }
        });

        No0.setBackground(new java.awt.Color(204, 255, 255));
        No0.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        No0.setText("0");
        No0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        No0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No0ActionPerformed(evt);
            }
        });

        Point.setBackground(new java.awt.Color(204, 255, 255));
        Point.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Point.setText(".");
        Point.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PointActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(AllClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(Div, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mul, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(No00, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(No7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(No4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(No1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(No8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(No5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(No2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(No0, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(No9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(No6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(No3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Point, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sub, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Equal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AllClear, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(Mul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Div, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Sub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(No9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(No7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(No8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(No6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(No4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(No5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(No1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(No2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(No3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(No00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(No0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Point, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void No1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_No1MouseClicked
        if(Display.getText().equals("0"))
            Display.setText("1");
        else
            Display.setText(Display.getText()+"1");
    }//GEN-LAST:event_No1MouseClicked

    private void No2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No2ActionPerformed
        if(Display.getText().equals("0"))
            Display.setText("2");
        else
            Display.setText(Display.getText()+"2");
    }//GEN-LAST:event_No2ActionPerformed

    private void No3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No3ActionPerformed
        if(Display.getText().equals("0"))
            Display.setText("3");
        else
            Display.setText(Display.getText()+"3");
    }//GEN-LAST:event_No3ActionPerformed

    private void No4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No4ActionPerformed
        if(Display.getText().equals("0"))
            Display.setText("4");
        else
            Display.setText(Display.getText()+"4");
    }//GEN-LAST:event_No4ActionPerformed

    private void No5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No5ActionPerformed
        if(Display.getText().equals("0"))
            Display.setText("5");
        else
            Display.setText(Display.getText()+"5");
    }//GEN-LAST:event_No5ActionPerformed

    private void No6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No6ActionPerformed
        if(Display.getText().equals("0"))
            Display.setText("6");
        else
            Display.setText(Display.getText()+"6");
    }//GEN-LAST:event_No6ActionPerformed

    private void No7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No7ActionPerformed
        if(Display.getText().equals("0"))
            Display.setText("7");
        else
            Display.setText(Display.getText()+"7");
    }//GEN-LAST:event_No7ActionPerformed

    private void No8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No8ActionPerformed
        if(Display.getText().equals("0"))
            Display.setText("8");
        else
            Display.setText(Display.getText()+"8");
    }//GEN-LAST:event_No8ActionPerformed

    private void No9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No9ActionPerformed
        if(Display.getText().equals("0"))
            Display.setText("9");
        else
            Display.setText(Display.getText()+"9");
    }//GEN-LAST:event_No9ActionPerformed

    private void No0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No0ActionPerformed
        if(!Display.getText().equals("0"))
            Display.setText(Display.getText()+"0");
    }//GEN-LAST:event_No0ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        if(!Display.getText().equals("0")){
            text = Display.getText();
            if(!text.substring(text.length() - 1,text.length()).equals(" ")){
                Display.setText(text.substring(0, text.length() - 1));
                if(text.substring(text.length() - 1,text.length()).equals("."))
                    point=0;
                if(Display.getText().equals(""))
                    Display.setText("0");
            }else{
                Display.setText(text.substring(0, text.length() - 3));
                operation = 0;
            }
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void PointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PointActionPerformed
        if(point==0){
            Display.setText(Display.getText()+".");
            point=1;
        }
    }//GEN-LAST:event_PointActionPerformed

    private void AllClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllClearActionPerformed
        operation=0;
        point=0;
        Display.setText("0");
    }//GEN-LAST:event_AllClearActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        if(operation==0){
            point=0;
            storeOperand1();
            Display.setText(Display.getText()+" + ");
            operator = "+";
            operation=1;
        }
    }//GEN-LAST:event_AddActionPerformed

    private void SubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubActionPerformed
        if(operation==0){
            point=0;
            storeOperand1();
            Display.setText(Display.getText()+" - ");
            operator = "-";
            operation=1;
        }
    }//GEN-LAST:event_SubActionPerformed

    private void MulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MulActionPerformed
        if(operation==0){
            point=0;
            storeOperand1();
            Display.setText(Display.getText()+" x ");
            operator = "x";
            operation=1;
        }
    }//GEN-LAST:event_MulActionPerformed

    private void DivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivActionPerformed
        if(operation==0){
            point=0;
            storeOperand1();
            Display.setText(Display.getText()+" / ");
            operator = "/";
            operation=1;
        }
    }//GEN-LAST:event_DivActionPerformed

    private void No00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No00ActionPerformed
        if(!Display.getText().equals("0"))
            Display.setText(Display.getText()+"00");
    }//GEN-LAST:event_No00ActionPerformed

    private void EqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualActionPerformed
        if(operation==1){
            point=1;
            storeOperand2();
            switch (operator) {
                case "+":
                    Display.setText(String.valueOf(operand1+operand2));
                    break;
                case "-":
                    Display.setText(String.valueOf(operand1-operand2));
                    break;
                case "x":
                    Display.setText(String.valueOf(operand1*operand2));
                    break;
                case "/":
                   Display.setText(String.valueOf(operand1/operand2));
                    break;
            }
            operation = 0;
        }
    }//GEN-LAST:event_EqualActionPerformed
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorUI().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton AllClear;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Display;
    private javax.swing.JButton Div;
    private javax.swing.JButton Equal;
    private javax.swing.JButton Mul;
    private javax.swing.JButton No0;
    private javax.swing.JButton No00;
    private javax.swing.JButton No1;
    private javax.swing.JButton No2;
    private javax.swing.JButton No3;
    private javax.swing.JButton No4;
    private javax.swing.JButton No5;
    private javax.swing.JButton No6;
    private javax.swing.JButton No7;
    private javax.swing.JButton No8;
    private javax.swing.JButton No9;
    private javax.swing.JButton Point;
    private javax.swing.JButton Sub;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
