package com.softline.javacake.designpattern.composite;

import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * @author softlinecode@gmail.com
 */
public class CakeComposite implements CakeComponent {

	private List<CakeComponent> cakeComponents = Lists.newArrayList();

	@Override
	public void cook() {
		if (CollectionUtils.isNotEmpty(cakeComponents)) {
			for (CakeComponent cake : cakeComponents) {
				cake.cook();
			}
		}
	}

	public void add(CakeComponent cakeComponent) {
		this.cakeComponents.add(cakeComponent);
	}

}
