package com.student.dao.impl;

import com.dao.util.DbUtil;
import com.dto.Student;
import com.student.dao.IStudentDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by AlvinOdins on 10/28/2016.
 */
public class IStudentDaoImpl implements IStudentDao {
    @Override
    public boolean addStudent(Student student) {

        String sql = "insert into students values(?,?,?,?,?,?,?,?)";
        Connection con = null;
        PreparedStatement pstmt = null;
        boolean isSave = false;

        try {
            con = DbUtil.getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, student.getFirstName());
            pstmt.setString(2, student.getMiddleName());
            pstmt.setString(3, student.getLastName());
            pstmt.setString(4, student.getEmail());
            pstmt.setString(5, student.getCno());
            pstmt.setString(6, student.getDob());
            pstmt.setString(7, student.getGender());
            pstmt.setString(8, student.getSemType());

            if (pstmt.executeUpdate() == 1) {
                isSave = true;
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return isSave;
    }

    @Override
    public List<Student> getAllStudents() {
        String sql = "select * from students";
        List<Student> studentList = null;
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = DbUtil.getConnection();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            studentList = new ArrayList<Student>();
            while (rs.next()){
                Student studentObj = new Student();

                studentObj.setFirstName(rs.getString(1));
                studentObj.setMiddleName(rs.getString(2));
                studentObj.setLastName(rs.getString(3));
                studentObj.setEmail(rs.getString(4));
                studentObj.setCno(rs.getString(5));
                studentObj.setDob(rs.getString(6));
                studentObj.setGender(rs.getString(7));
                studentObj.setSemType(rs.getString(8));

                studentList.add(studentObj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return studentList;
    }
}
