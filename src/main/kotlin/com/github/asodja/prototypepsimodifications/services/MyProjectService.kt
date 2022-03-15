package com.github.asodja.prototypepsimodifications.services

import com.intellij.openapi.project.Project
import com.github.asodja.prototypepsimodifications.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
