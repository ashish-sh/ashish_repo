package com.techprimers.springbatchexample1.config;

import com.techprimers.springbatchexample1.model.User;
import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

import java.util.Date;

public class RowMapperImpl implements RowMapper<User> {
    public RowMapperImpl() {
    }

    @Override
    public User mapRow(RowSet rs) throws Exception {
        if (rs == null || rs.getCurrentRow() == null) {
            return null;
        }
        User u1 = new User();
        u1.setName(rs.getColumnValue(1));
        u1.setDept(rs.getColumnValue(2));
        u1.setSalary(Double.parseDouble(rs.getColumnValue(3)));
        u1.setTime(new Date());
        return u1;
    }

}
