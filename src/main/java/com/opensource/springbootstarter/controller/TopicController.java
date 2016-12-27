package com.opensource.springbootstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opensource.springbootstarter.service.TopicService;
import com.opensource.springbootstarter.viewbean.TopicViewBean;

/**
 * @author akumarpadhee
 *
 */
@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<TopicViewBean> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public TopicViewBean getTopic(@PathVariable("id") String id){
		return topicService.getTopic(id);
	}
	
	@RequestMapping(value="/topics",method=RequestMethod.POST)
	public void addTopic(@RequestBody TopicViewBean viewBean){
		topicService.addTopic(viewBean);
	}
	
	@RequestMapping(value="/topics/{id}",method=RequestMethod.PUT)
	public void updateTopic(@RequestBody TopicViewBean viewBean, @PathVariable("id") String id){
		topicService.updateTopic(id, viewBean);
	}
	
	@RequestMapping(value="/topics/{id}",method=RequestMethod.DELETE)
	public void deleteTopic(@PathVariable("id") String id){
		 topicService.deleteTopic(id);
	}

}
