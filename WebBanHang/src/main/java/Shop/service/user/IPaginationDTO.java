package Shop.service.user;

import org.springframework.stereotype.Service;

import Shop.DTO.PaginationDTO;

@Service
public interface IPaginationDTO {
	public PaginationDTO getInfoPaginates(Integer TotalData, Integer limit, Integer CurrentPage);
}
