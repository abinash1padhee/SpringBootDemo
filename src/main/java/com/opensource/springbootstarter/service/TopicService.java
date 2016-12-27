package com.opensource.springbootstarter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.opensource.springbootstarter.viewbean.TopicViewBean;

/**
 * @author akumarpadhee
 *
 */
@Service
public class TopicService {
	
	private List<TopicViewBean> topics = new ArrayList<>(Arrays.asList(
			new TopicViewBean("spring-boot","SpringBoot","An approach for Spring apps"),
			new TopicViewBean("angular2","Angular 2","Latest version of Angular"),
			new TopicViewBean("mysql","MySql","Database Type")
			));
	
	public List<TopicViewBean> getAllTopics(){
		 return this.topics;
	}
	
	// Lambda expression
	public TopicViewBean getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(TopicViewBean viewBean) {
		topics.add(viewBean);
	}

	public void updateTopic(String id, TopicViewBean viewBean) {
		for(TopicViewBean topic : topics) {
			if(topic.getId().equals(id)){
				topic.setId(id);
				topic.setName(viewBean.getName());
				topic.setDescription(viewBean.getDescription());
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}

}
