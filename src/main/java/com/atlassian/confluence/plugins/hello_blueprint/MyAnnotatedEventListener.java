package com.atlassian.confluence.plugins.hello_blueprint;

import com.atlassian.confluence.plugins.createcontent.api.events.BlueprintPageCreateEvent;
import com.atlassian.confluence.plugins.createcontent.impl.ContentBlueprint;
import com.atlassian.event.api.EventListener;
import com.atlassian.event.api.EventPublisher;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.atlassian.confluence.labels.Label;
import com.atlassian.confluence.labels.LabelManager;
import com.atlassian.confluence.labels.Labelable;
import com.atlassian.confluence.labels.Namespace;
import com.atlassian.confluence.spaces.Space;
import com.atlassian.confluence.spaces.SpaceDescription;
import com.atlassian.confluence.pages.Page;
import com.atlassian.confluence.pages.PageManager;

/**
 * This provider uses the helloService to generate the page title for the howdy blueprint.
 */
@Component
public abstract class MyAnnotatedEventListener implements InitializingBean, DisposableBean {

	/** private static final Logger log = LoggerFactory.getLogger(MyAnnotatedEventListener.class);
	
	public EventPublisher eventPublisher;
	public PageManager pageManager;
	public ThemeManager themeManager;
	public LabelManager labelManager;
	private final EventPublisher eventPublisher;
	private final LabelManager labelManager;
	*/
	public EventPublisher eventPublisher;
	public LabelManager labelManager;
	public PageManager pageManager;

 
}
