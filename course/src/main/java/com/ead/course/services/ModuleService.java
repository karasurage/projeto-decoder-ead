package com.ead.course.services;

import com.ead.course.models.ModuleModel;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface ModuleService {

    void delete(ModuleModel moduleModel);

    ModuleModel save(ModuleModel moduleModel);

    Optional<ModuleModel> findModuleIntoCourse(UUID courseId, UUID moduleId);

    List<ModuleModel> findAllByCourses(UUID courseId);

    Optional<ModuleModel> findById(UUID moduleId);

    Page<ModuleModel> findAllByModule(Specification<ModuleModel> spec, Pageable pageable);
}
