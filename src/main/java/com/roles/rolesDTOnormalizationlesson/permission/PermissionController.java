package com.roles.rolesDTOnormalizationlesson.permission;

import com.roles.rolesDTOnormalizationlesson.response.ResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@AllArgsConstructor
@RequestMapping("/lesson/permissions")
public class PermissionController {

    private final PermissionService permissionService;

    @PostMapping
    public ResponseDTO<String> create(@RequestBody CreatePermissionDTO dto){
        return permissionService.create(dto);
    }

    @GetMapping("/{permissionId}")
    public ResponseDTO<PermissionsDTO> searchOne(@PathVariable long permissionId) {
        return permissionService.searchOne(permissionId);
    }

    @GetMapping
    public ResponseDTO<List<PermissionsDTO>> search(Map<String, ?> queryParams) {
        return permissionService.search(queryParams);
    }

    @DeleteMapping("/{permissionId}")
    public ResponseDTO<String> delete(@PathVariable("permissionId") long permissionId) {
        return permissionService.delete(permissionId);
    }
}
