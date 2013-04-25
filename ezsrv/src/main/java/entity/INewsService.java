package entity;

import java.util.List;

import com.bj58.spat.gaea.server.contract.annotation.OperationContract;
import com.bj58.spat.gaea.server.contract.annotation.ServiceContract;

import entity.News;

@ServiceContract
public interface INewsService {
	@OperationContract
	public News getNewsByID(int newsID) throws Exception;
	
	@OperationContract
	public List<News> getNewsByCateID() throws Exception;
}
