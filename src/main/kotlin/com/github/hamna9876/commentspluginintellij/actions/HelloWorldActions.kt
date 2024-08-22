package com.github.hamna9876.commentspluginintellij.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelloWorldActions : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        Messages.showInfoMessage("Hello World", "Info")
    }
}