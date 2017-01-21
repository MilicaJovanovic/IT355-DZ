package com.milica.dao.impl;

import com.milica.dao.SobaDao;
import com.milica.mapper.SobaMapper;
import com.milica.model.Soba;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Milica
 */
public class SobaDaoImpl implements SobaDao {
    private JdbcTemplate jdbcTemplate;
    @SuppressWarnings("unused")
    private DataSource dataSource;
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int getCount() {
      String sql = "SELECT COUNT(*) FROM SOBA";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public List<Soba> getAllSoba() {
        String sql= "SELECT * FROM SOBA";
        List<Soba> sobe= jdbcTemplate.query(sql, new SobaMapper());
        return sobe;
    }

    @Override
    public boolean addSoba(Soba soba) {
       String sql = "INSERT INTO SOBA " + "(ID, BROJ_KREVETA, VELICINA, KUPATILO, TV, KLIMA, CENA_PO_DANU) VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[] {soba.getId(), soba.getBrojKreveta(), soba.getVelicina(), soba.getKupatilo(), soba.getTv(), soba.getKlima(), soba.getCenaPoDanu()});
        return true;
    }
}
