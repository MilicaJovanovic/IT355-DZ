package com.milica.mapper;

import com.milica.model.Gost;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Milica
 */
public class GostMapper implements RowMapper<Gost>{
    @Override
    public Gost mapRow(ResultSet rs, int arg1) throws SQLException {
        Gost gost = new Gost();
        gost.setId(rs.getInt("id"));
        gost.setIme(rs.getString("ime"));
        gost.setPrezime(rs.getString("prezime"));
        gost.setTelefon(rs.getString("telefon"));
        return gost;
    }
}
