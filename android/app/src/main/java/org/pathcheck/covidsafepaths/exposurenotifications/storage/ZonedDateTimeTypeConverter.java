/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.pathcheck.covidsafepaths.exposurenotifications.storage;

import org.threeten.bp.ZonedDateTime;
import org.threeten.bp.format.DateTimeFormatter;

/**
 * TypeConverters for converting to and from {@link ZonedDateTime} instances.
 */
public class ZonedDateTimeTypeConverter {

  private ZonedDateTimeTypeConverter() {
    // no instantiation
  }

  private static final DateTimeFormatter sFormatter = DateTimeFormatter.ISO_ZONED_DATE_TIME;

  public static ZonedDateTime toOffsetDateTime(String timestamp) {
    if (timestamp != null) {
      return sFormatter.parse(timestamp, ZonedDateTime.FROM);
    } else {
      return null;
    }
  }

  public static String fromOffsetDateTime(ZonedDateTime timestamp) {
    if (timestamp != null) {
      return timestamp.format(sFormatter);
    } else {
      return null;
    }
  }
}
