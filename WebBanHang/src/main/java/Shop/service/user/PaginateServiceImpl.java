package Shop.service.user;

import Shop.DTO.PaginationDTO;

public class PaginateServiceImpl {
	public PaginationDTO getInfoPaginates(Integer TotalData, Integer limit, Integer CurrentPage) {
		PaginationDTO paginate = new PaginationDTO();
		paginate.setLimit(limit);
		paginate.setCurrentPage(CheckCurrentPage(CurrentPage,paginate.getCurrentPage()));
		paginate.setTotalPage(setInfoTotalPage(TotalData,limit));
		
		int start = FindStart(paginate.getCurrentPage(),limit);
		paginate.setStart(start);
		int end = FindEnd(paginate.getStart(),limit,TotalData);
		paginate.setEnd(end);
		return paginate;
	}

	private int FindEnd(int start, Integer limit, Integer totalData) {
		if(start+limit>totalData) {
			return totalData;
		}
		else {
			return start+limit-1;
		}
	}

	private int FindStart(Integer currentPage, Integer limit) {
		
		return ((currentPage-1)*limit)+1;
	}

	private Integer setInfoTotalPage(Integer TotalData, Integer limit) {
		int totalPage = 0;
		
		totalPage = TotalData/limit;
		
		if(totalPage*limit<TotalData) {
			return totalPage+1;
		}
		else {
			return totalPage;
		}
		
		
	}
	
	
	private Integer CheckCurrentPage(Integer CurrentPage, Integer TotalPage) {
		if(CurrentPage<1) {
			return 1;
		}
		else {
			return CurrentPage;
		}
	}

}
