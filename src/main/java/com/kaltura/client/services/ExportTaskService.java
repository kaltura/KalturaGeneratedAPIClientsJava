// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2017  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.services;

import com.kaltura.client.Params;
import com.kaltura.client.types.ExportTask;
import com.kaltura.client.types.ExportTaskFilter;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class ExportTaskService {

	/**  Adds a new bulk export task  */
    public static RequestBuilder<ExportTask> add(ExportTask task)  {
        Params kparams = new Params();
        kparams.add("task", task);

        return new RequestBuilder<ExportTask>(ExportTask.class, "exporttask", "add", kparams);
    }

	/**  Deletes an existing bulk export task by task identifier  */
    public static RequestBuilder<Boolean> delete(long id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<Boolean>(Boolean.class, "exporttask", "delete", kparams);
    }

	/**  Gets an existing bulk export task by task identifier  */
    public static RequestBuilder<ExportTask> get(long id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<ExportTask>(ExportTask.class, "exporttask", "get", kparams);
    }

    public static RequestBuilder<ListResponse<ExportTask>> list()  {
        return list(null);
    }

	/**  Returns bulk export tasks by tasks identifiers  */
    public static RequestBuilder<ListResponse<ExportTask>> list(ExportTaskFilter filter)  {
        Params kparams = new Params();
        kparams.add("filter", filter);

        return new ListResponseRequestBuilder<ExportTask>(ExportTask.class, "exporttask", "list", kparams);
    }

	/**  Updates an existing bulk export task by task identifier  */
    public static RequestBuilder<ExportTask> update(long id, ExportTask task)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("task", task);

        return new RequestBuilder<ExportTask>(ExportTask.class, "exporttask", "update", kparams);
    }
}
