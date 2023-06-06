/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.theloai;
import utils.DBConnectionUtils;

/**
 *
 * @author Kin
 */
public class ThongKeDAO {

    public static int findA() {
        Connection con = DBConnectionUtils.getConnection();
        int n = 0;
        String sql = "SELECT count(maBD) \n"
                + "from diem\n"
                + "where tongDiem >= 8.5";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                n = rs.getInt("count(maBD)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n;
    }
    public static int findB() {
        Connection con = DBConnectionUtils.getConnection();
        int n = 0;
        String sql = "SELECT count(maBD) \n"
                + "from diem\n"
                + "where tongDiem >= 7 and tongDiem < 8.5";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                n = rs.getInt("count(maBD)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n;
    }
    public static int findC() {
        Connection con = DBConnectionUtils.getConnection();
        int n = 0;
        String sql = "SELECT count(maBD) \n"
                + "from diem\n"
                + "where tongDiem >= 5.5 and tongDiem < 7";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                n = rs.getInt("count(maBD)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n;
    }
    public static int findD() {
        Connection con = DBConnectionUtils.getConnection();
        int n = 0;
        String sql = "SELECT count(maBD) \n"
                + "from diem\n"
                + "where tongDiem >= 4 and tongDiem < 5.5";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                n = rs.getInt("count(maBD)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n;
    }
    public static int findF() {
        Connection con = DBConnectionUtils.getConnection();
        int n = 0;
        String sql = "SELECT count(maBD) \n"
                + "from diem\n"
                + "where tongDiem < 4";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                n = rs.getInt("count(maBD)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n;
    }
}
