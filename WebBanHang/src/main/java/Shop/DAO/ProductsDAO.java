package Shop.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Shop.DTO.ProductsDTO;
import Shop.DTO.ProductsDTOMapper;

@Repository
public class ProductsDAO {
@Autowired
	
	public JdbcTemplate _jdbcTemplate;
	private final boolean NO = false;
	private final boolean YES = true;
	public StringBuffer SqlString() {
		StringBuffer  sql = new StringBuffer();
		sql.append("SELECT p.id as id_product ");
		sql.append(",p.id_category ");
		sql.append(",p.name,p.size ");
		sql.append(",p.price ");
		sql.append(",p.sale ");
		sql.append(",p.title ");
		sql.append(",p.highlight ");
		sql.append(",p.new_product ");
		sql.append(",p.details ");
		sql.append(",c.id as id_color ");
		sql.append(",c.name as name_color ");
		sql.append(",c.code as code_color ");
		sql.append(",c.img ");
		sql.append(",p.created_at ");
		sql.append(",p.updated_at ");
		sql.append("from products as p INNER JOIN colors AS c ON p.id =c.id_product ");
		
		return sql;
	}
	public String SqlProducts(boolean NewProduct,boolean HighLight) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		if(HighLight){
			sql.append("and p.highlight=true ");
		}
		if(NewProduct) {
			sql.append("and p.new_product=true ");
		}
		
		sql.append("GROUP BY p.id,c.id_product ");
		sql.append("ORDER BY RAND() ");
		if(HighLight){
			sql.append("LIMIT 9 ");
		}
		if(NewProduct) {
			sql.append("LIMIT 12 ");
		}
		return sql.toString();
		
		
	}
	public List<ProductsDTO> getDataProducts(){
		String sql = SqlProducts(YES,NO);
		List<ProductsDTO> list = new ArrayList<ProductsDTO>();
		list = _jdbcTemplate.query(sql, new ProductsDTOMapper());
		return list;		
	}
}

