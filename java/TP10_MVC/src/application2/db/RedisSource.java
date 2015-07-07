package application2.db;

import java.util.ArrayList;

import com.aigogeek.javred.SimpleRedis;

public class RedisSource implements ISource {
    final SimpleRedis sRedis = new SimpleRedis();
    
	@Override
	public void init() {
	    sRedis.initConnection("www.aigogeek.com", 9003);
	}

	@Override
	public ArrayList<String> getStringList(String name) {
		return sRedis.lrange(name);
	}

}
