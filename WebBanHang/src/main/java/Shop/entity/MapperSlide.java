package Shop.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSlide implements RowMapper<Slide>{

	@Override
	public Slide mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Slide slide = new Slide();
		slide.setId(rs.getInt("id"));
		slide.setContent(rs.getString("content"));
		slide.setImg(rs.getString("img"));
		slide.setCaption(rs.getString("caption"));;
			
		return slide;
	}
	
}
