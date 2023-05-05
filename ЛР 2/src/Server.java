import java.awt.Color;
import java.net.*;
import java.sql.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;

public class Server extends JFrame{

    ServerSocket sock;
    InputStream is;
    OutputStream os;
    String st;
    String stroka;
    JTable table1;JScrollPane sp;
    static String aNumber, aNewNumber, aStartDate, aNewStartDate, aExpireDate, aNewExpireDate, aFIO, aNewFIO, aSumm, aNewSumm;

    Statement sq;
    DefaultTableModel DTM;
    String vibor_naim;
    Connection db;
    String colheads[]={"Номер", "Дата подписания", "Дата окончания","ФИО","Сумма"};
    static Object dataConditer[][];
    byte bytemessage[] = new byte[10000];


    public Server(String Title){
        super(Title);
        setLayout(null);
        DTM=new DefaultTableModel(dataConditer,colheads);
        table1=new JTable(DTM);
        table1.setBackground(Color.getHSBColor(159, 216, 234));
        JScrollPane sp=new JScrollPane(table1,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setBounds(50,5,350,250);
        add(sp);
        this.setSize(500,450);
        this.setVisible(true);
        addWindowListener(new WindowClose());
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            db=DriverManager.getConnection("jdbc:mysql://localhost:3306/agreements", "root", "zhenyayarosh_22112004");
            sq=db.createStatement();
            StringBuffer x = new StringBuffer();
            String  sq_str="SELECT * FROM agreements";
            ResultSet rs= sq.executeQuery(sq_str);
            while(rs.next()){

                aNumber =rs.getString("agree_number");
                aStartDate =rs.getString("agree_date");
                aExpireDate =rs.getString("expire_date");
                aFIO =rs.getString("client");
                aSumm =rs.getString("summ");

                Object addingData[]= {aNumber, aStartDate, aExpireDate, aFIO, aSumm};
                DTM.addRow(addingData);
                st = (aNumber + "/" + aStartDate +"/" + aExpireDate +"/"+ aFIO +"/" + aSumm +"/");


                x.append(st);
            }
            stroka=x.toString();
            sock=new ServerSocket(127);
            while(true)
            {
                Socket client=sock.accept();
                is=client.getInputStream();
                os=client.getOutputStream();
                bytemessage=stroka.getBytes();
                os.write(bytemessage);
                boolean flag = true;
                while(flag==true)
                {
                    byte readmessage[] = new byte[10000];
                    is.read(readmessage);
                    String tempString=new String(readmessage,0,readmessage.length);
                    String arrStr[] = tempString.split("/");
                    if(arrStr[0].compareTo("0")==0) {
                        int rowNumber = Integer.valueOf(arrStr[1].trim());
                        Object agree_number = DTM.getValueAt(rowNumber,0);
                        DTM.removeRow(rowNumber);
                        String sq_str_delete="DELETE FROM agreements WHERE agree_number="+agree_number;
                        int rs_update1= sq.executeUpdate(sq_str_delete);
                    }
                    else if(arrStr[0].compareTo("1")==0)
                    {
                        stroka=  stroka + tempString;
                        aNewNumber =arrStr[1];
                        aNewStartDate =arrStr[2];
                        aNewExpireDate =arrStr[3];
                        aNewFIO =arrStr[4];
                        aNewSumm =arrStr[5];
                        Object addingData[]={aNewNumber, aNewStartDate, aNewExpireDate, aNewFIO, aNewSumm};
                        DTM.addRow(addingData);
                        String sq_str_insert="INSERT INTO agreements VALUES ('"+(DTM.getRowCount())+"','"+ aNewNumber +"','"+ aNewStartDate +"','"+ aNewExpireDate +"','"+ aNewFIO +"','"+ aNewSumm +"')";
                        int rs_update2= sq.executeUpdate(sq_str_insert);
                    }
                    else if(arrStr[0].compareTo("2")==0)
                    {
                        stroka=  stroka+tempString;

                        int rowNumber = Integer.valueOf(arrStr[6].trim());
                        Object agree_number = DTM.getValueAt(rowNumber,0);

                        aNewNumber =arrStr[1];
                        aNewStartDate =arrStr[2];
                        aNewExpireDate =arrStr[3];
                        aNewFIO =arrStr[4];
                        aNewSumm =arrStr[5];
                        Object addingData[]={aNewNumber, aNewStartDate, aNewExpireDate, aNewFIO, aNewSumm};

                        DTM.setValueAt(addingData[0],rowNumber,0);
                        DTM.setValueAt(addingData[1],rowNumber,1);
                        DTM.setValueAt(addingData[2],rowNumber,2);
                        DTM.setValueAt(addingData[3],rowNumber,3);
                        DTM.setValueAt(addingData[4],rowNumber,4);
                        String sq_str_update="UPDATE agreements SET agree_number='"+ aNewNumber +"',agree_date='"+ aNewStartDate +"',expire_date='"+ aNewExpireDate +"',client='"+ aNewFIO +"',summ='"+ aNewSumm +"' WHERE agree_number='"+agree_number+"';";
                        int rs_update3= sq.executeUpdate(sq_str_update);
                    }
                }
                is.close();
                os.close();
                client.close();
            }
        }
        catch(Exception e){System.out.println("sfsfs");}
    }

    public static void main(String args[]){
        Server classObj=new Server("Server");
    }


    class WindowClose extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }
}
