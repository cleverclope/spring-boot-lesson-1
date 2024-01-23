package com.roles.rolesDTOnormalizationlesson.permission;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PermissionsDTO {
    private String permissionName;
    private String permissionDescription;
}
