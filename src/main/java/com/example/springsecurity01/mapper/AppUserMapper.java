package com.example.springsecurity01.mapper;

import com.example.springsecurity01.model.AppUser;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AppUserMapper implements RowMapper {

    public static final String BASE_SQL //
            = "Select u.User_Id, u.User_Name, u.Encryted_Password From APP_USER u ";

    @Override
    public AppUser mapRow(ResultSet rs, int rowNum) throws SQLException {

        Long userId = rs.getLong("User_Id");
        String userName = rs.getString("User_Name");
        String encrytedPassword = rs.getString("Encryted_Password");

        return new AppUser(userId, userName, encrytedPassword);
    }

}