package com.milica.dao.impl;

import com.milica.dao.GostDao;
import com.milica.mapper.GostMapper;
import com.milica.model.Gost;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Milica
 */

public class GostDaoImpl implements GostDao {
    private JdbcTemplate jdbcTemplate;
    @SuppressWarnings("unused")
    private DataSource dataSource;
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int getCount() {
      String sql = "SELECT COUNT(*) FROM GOST";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public List<Gost> getAllGost() {
        String sql= "SELECT * FROM GOST";
        List<Gost> gosti= jdbcTemplate.query(sql, new GostMapper());
        return gosti;
    }

    @Override
    public boolean addGost(Gost gost) {
       String sql = "INSERT INTO GOST " + "(ID, IME, PREZIME, TELEFON) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[] {gost.getId(), gost.getIme(), gost.getPrezime(), gost.getTelefon()});
        return true;
    }
}
