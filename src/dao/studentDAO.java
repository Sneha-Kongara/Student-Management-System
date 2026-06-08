package dao;
import dao.StudentDAO;
import model.Student;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;

import database.DBConnection;
import model.Student;

public class StudentDAO {

    StudentDAO dao = new StudentDAO();
    Connection con = DBConnection.getConnection();

    public boolean addStudent(Student s) {

        try {

            String sql =
                    "INSERT INTO students(name,course,email,phone) VALUES(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getCourse());
            ps.setString(3, s.getEmail());
            ps.setString(4, s.getPhone());

            return ps.executeUpdate() > 0;

        } catch(Exception e) {

            e.printStackTrace();
        }

        return false;
    }

    public boolean updateStudent(Student s) {

        try {

            String sql =
                    "UPDATE students SET name=?, course=?, email=?, phone=? WHERE student_id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getCourse());
            ps.setString(3, s.getEmail());
            ps.setString(4, s.getPhone());
            ps.setInt(5, s.getId());

            return ps.executeUpdate() > 0;

        } catch(Exception e) {

            e.printStackTrace();
        }

        return false;
    }

    public boolean deleteStudent(int id) {

        try {

            String sql =
                    "DELETE FROM students WHERE student_id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            return ps.executeUpdate() > 0;

        } catch(Exception e) {

            e.printStackTrace();
        }

        return false;
    }

    public Student searchStudent(int id) {

        try {

            String sql =
                    "SELECT * FROM students WHERE student_id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs =
                    ps.executeQuery();

            if(rs.next()) {

                Student s =
                        new Student();

                s.setId(rs.getInt("student_id"));
                s.setName(rs.getString("name"));
                s.setCourse(rs.getString("course"));
                s.setEmail(rs.getString("email"));
                s.setPhone(rs.getString("phone"));

                return s;
            }

        } catch(Exception e) {

            e.printStackTrace();
        }

        return null;
    }

    public ArrayList<Student> getAllStudents() {

        ArrayList<Student> list =
                new ArrayList<>();

        try {

            String sql =
                    "SELECT * FROM students";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()) {

                Student s =
                        new Student();

                s.setId(rs.getInt("student_id"));
                s.setName(rs.getString("name"));
                s.setCourse(rs.getString("course"));
                s.setEmail(rs.getString("email"));
                s.setPhone(rs.getString("phone"));

                list.add(s);
            }

        } catch(Exception e) {

            e.printStackTrace();
        }

        return list;
    }
}
