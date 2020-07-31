package com.atlassian.confluence.plugins.hello_blueprint;

import com.atlassian.confluence.plugins.createcontent.api.contextproviders.AbstractBlueprintContextProvider;
import com.atlassian.confluence.plugins.createcontent.api.contextproviders.BlueprintContext;
import static com.atlassian.confluence.plugins.createcontent.actions.DefaultBlueprintContentGenerator.CONTENT_PAGE_TITLE_CONTEXT_KEY;
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
import com.atlassian.confluence.event.events.content.page.PageCreateEvent;
import com.atlassian.confluence.plugins.hello_blueprint.MyAnnotatedEventListener;

/**
 * Provides content for the "Hierarchy" Child A Blueprint.
 *
 * @since 1.6
 */
public class MobilizationPlaybookActivitiesContextProvider extends AbstractBlueprintContextProvider
{
	private LabelManager labelManager;
    @Override
    protected BlueprintContext updateBlueprintContext(BlueprintContext context)
    {
        context.put("foo", "bar");
		//blueprintContext.put("ParentPageTitle", "");
		context.put("ParentPageTitle", "");
        //context.put(CONTENT_PAGE_TITLE_CONTEXT_KEY, "Erza Scarlet");
		context.setTitle("Mobilization Playbook Activities");
        return context;
       
    }
	
	@EventListener
	public void pageCreatedEvent(PageCreateEvent event) {
	
    if (event.getPage().getTitle().equalsIgnoreCase("Mobilization Playbook Activities")) {
        labelManager.addLabel((Labelable) event.getPage(), new Label("put-in-your-label"));
    }
    

}
}
