package com.roles.rolesDTOnormalizationlesson.response;

import java.util.List;
import java.util.Map;

public interface SharedResponseService<T> {

        ResponseDTO<List<T>> search(Map<String , ?> queryParams);
        ResponseDTO<T>searchOne(long id);
}
