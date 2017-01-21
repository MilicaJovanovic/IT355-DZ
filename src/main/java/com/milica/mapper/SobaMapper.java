package com.milica.mapper;

import com.milica.model.Soba;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Milica
 */
public class SobaMapper implements RowMapper<Soba>{
    @Override
    public Soba mapRow(ResultSet rs, int arg1) throws SQLException {
        Soba soba = new Soba();
        soba.setId(rs.getInt("id"));
        soba.setBrojKreveta(rs.getInt("broj_kreveta"));
        soba.setVelicina(rs.getDouble("velicina"));
        soba.setKupatilo(rs.getString("kupatilo"));
        soba.setTv(rs.getString("tv"));
        soba.setKlima(rs.getString("klima"));
        soba.setCenaPoDanu(rs.getDouble("cena_po_danu"));
        return soba;
    }
}
