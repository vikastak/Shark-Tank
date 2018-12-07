package sharkTank

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Abhishek
 */
@WebServlet(urlPatterns = {"/insert_to_db"})
public class insert_to_db extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            URL url = new URL("https://gist.githubusercontent.com/niyando/2436efccdf7cded96e968cd70f4cc9c0/raw/fd44f075614ac069767f9544c52242e91cdf9950/shark_tank_data.csv");
            URLConnection connection = url.openConnection();

            InputStreamReader input = new InputStreamReader(connection.getInputStream());
            BufferedReader buffer = null;
            String line = "";
            String SplitBy = ",";
            Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:5000/shark","root","");
                PreparedStatement ps=(PreparedStatement) con.prepareStatement("insert into shark_table values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");  
                buffer = new BufferedReader(input);
                while ((line = buffer.readLine()) != null) {
                      String[] data = line.split(SplitBy);
                      int i=1;
                      for(String w : data)
                      {//System.out.println("*********");
                          ps.setString(i,w);i++;ps.setString(i,w);i++;ps.setString(i,w);i++;ps.setString(i,w);i++;
                          ps.setString(i,w);i++;ps.setString(i,w);i++;ps.setString(i,w);i++;ps.setString(i,w);i++;
                          ps.setString(i,w);
                      }
                      
                       int j=ps.executeUpdate();  
                       System.out.println(j+" records inserted");     
                }
            public ArrayList SeriesFilter(int series) {
                String quy="SELECT * FROM shark_table WHERE series='"+series+"'";
                Connection con =ConnectionFactory.getConnection();
                ArrayList mylist = new ArrayList();
                try {
                    Statement sts=con.createStatement();
                    ResultSet resultSet=sts.executeQuery(quy);
                    while(rs.next()) {
                        GetterAndSetter s1 = new GetterAndSetter();
                        s1.setRow(resultSet.getInt(1));
                        s1.setSeason(resultSet.getInt(2));
                        s1.setSeries(resultSet.getInt(3));
                        s1.setCompany(resultSet.getString(4));
                        s1.setDeal(resultSet.getString(5));
                        s1.setIndustory(resultSet.getString(6));
                        s1.setGender(resultSet.getString(7));
                        s1.setAmount(resultSet.getInt(8));
                        Alist.add(s1);

                    }

                }

                catch(SQLException e)
                {
                    e.printStackTrace();
                }


                return mylist;

            }
            public ArrayList SeasonFilter(int season) {
                String quy="SELECT * FROM shark_table WHERE season='"+season+"'";
                Connection con=ConnectionFactory.getConnection();
                ArrayList mylist = new ArrayList();
                try {
                    Statement sts=con.createStatement();
                    ResultSet resultSet=sts.executeQuery(quy);
                    while(rs.next()) {
                        GetterAndSetter s1 = new GetterAndSetter();
                        s1.setRow(resultSet.getInt(1));
                        s1.setSeason(resultSet.getInt(2));
                        s1.setSeries(resultSet.getInt(3));
                        s1.setCompany(resultSet.getString(4));
                        s1.setDeal(resultSet.getString(5));
                        s1.setIndustory(resultSet.getString(6));
                        s1.setGender(resultSet.getString(7));
                        s1.setAmount(resultSet.getInt(8));
                        Alist.add(s1);

                    }

                }
                catch(SQLException e)
                {
                    e.printStackTrace();
                }


                return mylist;

            }

            public ArrayList AmountFilter(int amount) {
                String que="SELECT * FROM shark_table WHERE amount='"+amount+"'";
                Connection con=ConnectionFactory.getConnection();
                ArrayList mylist = new ArrayList();
                try {
                    Statement sts=con.createStatement();
                    ResultSet resultSet=sts.executeQuery(quy);
                    while(rs.next()) {
                        GetterAndSetter s1 = new GetterAndSetter();
                        s1.setRow(resultSet.getInt(1));
                        s1.setSeason(resultSet.getInt(2));
                        s1.setSeries(resultSet.getInt(3));
                        s1.setCompany(resultSet.getString(4));
                        s1.setDeal(resultSet.getString(5));
                        s1.setIndustory(resultSet.getString(6));
                        s1.setGender(resultSet.getString(7));
                        s1.setAmount(resultSet.getInt(8));
                        Alist.add(s1);

                    }

                }

                catch(SQLException e)
                {
                    e.printStackTrace();
                }


                return mylist;

            }
            public ArrayList GenderFilter(String gender) {
                String que="SELECT * FROM shark_table WHERE gender='"+gender+"'";
                Connection con=ConnectionFactory.getConnection();
                ArrayList mylist = new ArrayList();
                try {
                    Statement sts=con.createStatement();
                    ResultSet resultSet=sts.executeQuery(quy);
                    while(rs.next()) {
                        GetterAndSetter s1 = new GetterAndSetter();
                        s1.setRow(resultSet.getInt(1));
                        s1.setSeason(resultSet.getInt(2));
                        s1.setSeries(resultSet.getInt(3));
                        s1.setCompany(resultSet.getString(4));
                        s1.setDeal(resultSet.getString(5));
                        s1.setIndustory(resultSet.getString(6));
                        s1.setGender(resultSet.getString(7));
                        s1.setAmount(resultSet.getInt(8));
                        Alist.add(s1);

                    }

                }

                catch(SQLException e)
                {
                    e.printStackTrace();
                }


                return mylist;

            }
            public ArrayList RowFilter(int row) {
                String quy="SELECT * FROM shark_table WHERE row='"+row+"'";
                Connection con=ConnectionFactory.getConnection();
                ArrayList mylist = new ArrayList();
                try {
                    Statement sts=con.createStatement();
                    ResultSet resultSet=sts.executeQuery(quy);
                    while(rs.next()) {
                        GetterAndSetter s1 = new GetterAndSetter();
                        s1.setRow(resultSet.getInt(1));
                        s1.setSeason(resultSet.getInt(2));
                        s1.setSeries(resultSet.getInt(3));
                        s1.setCompany(resultSet.getString(4));
                        s1.setDeal(resultSet.getString(5));
                        s1.setIndustory(resultSet.getString(6));
                        s1.setGender(resultSet.getString(7));
                        s1.setAmount(resultSet.getInt(8));
                        Alist.add(s1);

                    }

                }

                catch(SQLException e)
                {
                    e.printStackTrace();
                }


                return mylist;

            }
        }
            catch(ClassNotFoundException e)
            {
                System.out.println("class-not-found");
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            catch(Exception e)
            {
                 System.out.println("exception-found");
            }
    }



}
