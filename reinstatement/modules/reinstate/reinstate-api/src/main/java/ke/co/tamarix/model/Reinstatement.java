/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package ke.co.tamarix.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Reinstatement service. Represents a row in the &quot;Reinstatement_Reinstatement&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ReinstatementModel
 * @generated
 */
@ImplementationClassName("ke.co.tamarix.model.impl.ReinstatementImpl")
@ProviderType
public interface Reinstatement extends PersistedModel, ReinstatementModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>ke.co.tamarix.model.impl.ReinstatementImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Reinstatement, Long>
		REINSTATEMENT_ID_ACCESSOR = new Accessor<Reinstatement, Long>() {

			@Override
			public Long get(Reinstatement reinstatement) {
				return reinstatement.getReinstatementId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Reinstatement> getTypeClass() {
				return Reinstatement.class;
			}

		};

}