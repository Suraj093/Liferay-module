package global.language.module.key;

import com.liferay.portal.kernel.language.UTF8Control;

import java.util.Enumeration;
import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true,property = {"language.id=en_US"},service = ResourceBundle.class)


public class EnglishLanguage extends ResourceBundle{
	
	public final ResourceBundle resourceBundle = ResourceBundle.getBundle("content.Language",
			UTF8Control.INSTANCE);

	@Override
	protected Object handleGetObject(String key) {
		// TODO Auto-generated method stub
		return resourceBundle.getObject(key);
	}

	@Override
	public Enumeration<String> getKeys() {
		// TODO Auto-generated method stub
		return resourceBundle.getKeys();
	}

}
