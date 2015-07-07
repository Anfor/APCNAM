package application2.db;

import java.util.List;

public interface ISource {
	public void init();
	public List<String> getStringList(String name); 
}
