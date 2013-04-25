package components;

import java.util.ArrayList;
import java.util.List;

import contract.INewsService;
import entity.News;

public class NewsService implements INewsService{

	@Override
	public News getNewsByID(int newsID) throws Exception {
		// TODO Auto-generated method stub
		return NewsService.getNews();
	}

	@Override
	public List<News> getNewsByCateID() throws Exception {
		// TODO Auto-generated method stub
		List<News> list = new ArrayList<News>();
		list.add(NewsService.getNews());
		list.add(NewsService.getNews());
		return null;
	}
	
	public static News getNews(){
		News news = new News();
		news.setNewsID(58);
		news.setTitle("一个 神奇 的 网站 ");
		return news;
	}

}
