package roboguice.inject;
/*
 * Copyright 2010 Rodrigo Damazio
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


import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Indicates that a variable member of a class (whether static or not) should be
 * injected with an Android preference from the current
 * {@link roboguice.activity.RoboPreferenceActivity}.
 * The value is compulsory, and correspond to the key of the preference.<br />
 * Usage example:<br />
 * {@code
 * @InjectPreference("feature_enabled")
 * protected CheckBoxPreference enabled;
 * }
 *
 * @author Rodrigo Damazio
 */
@Retention(RUNTIME)
@Target( { ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD })
public @interface InjectPreference {
    String value();
}
