package jmcheynier.apps.portfolio.models.SAP.conversationalAI;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo( 
		use = JsonTypeInfo.Id.NAME, 
		include = JsonTypeInfo.As.PROPERTY, 
		property = "type")
@JsonSubTypes({ 
	@Type(value = MessageButton.class, name = "buttons"), 
	@Type(value = MessageText.class, name = "text"),
	@Type(value = MessageQuickReplies.class, name = "quickReplies") 	
})

public abstract class Message {

	public Message() {}

}
