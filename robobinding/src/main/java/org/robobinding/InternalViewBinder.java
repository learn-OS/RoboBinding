/**
 * Copyright 2012 Cheng Wei, Robert Taylor
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package org.robobinding;

import org.robobinding.binder.NonBindingViewInflater;

import android.view.View;
import android.view.ViewGroup;

/**
 * 
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Robert Taylor
 * @author Cheng Wei
 */
public class InternalViewBinder {
    private final BinderImplementor binderImplementor;
    private final NonBindingViewInflater nonBindingViewInflater;

    public InternalViewBinder(BinderImplementor binderImplementor, NonBindingViewInflater nonBindingViewInflater) {
	this.binderImplementor = binderImplementor;
	this.nonBindingViewInflater = nonBindingViewInflater;
    }

    public View inflate(int layoutId) {
        return nonBindingViewInflater.inflate(layoutId);
    }

    public View inflateAndBind(int layoutId, Object presentationModel) {
	return binderImplementor.inflateAndBind(layoutId, presentationModel);
    }

    public View inflateAndBind(int layoutId, Object presentationModel, ViewGroup attachToRoot) {
	return binderImplementor.inflateAndBind(layoutId, presentationModel, attachToRoot);
    }

}
