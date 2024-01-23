package com.roles.rolesDTOnormalizationlesson.role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolesDTO {
    private String roleName;
    private String roleDescription;
    //    Why don't we maintain one DTO since attributes are the same
}
