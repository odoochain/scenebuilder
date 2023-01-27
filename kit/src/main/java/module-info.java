module kit {
    requires java.desktop;
    requires java.logging;
    requires java.prefs;
    requires java.xml;
    requires aether.api;
    requires aether.connector.basic;
    requires aether.impl;
    requires aether.spi;
    requires aether.transport.file;
    requires aether.transport.http;
    requires aether.util;
    requires com.gluonhq.charm.glisten;
    requires commons.lang3;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.swing;
    requires javafx.web;
    requires maven.aether.provider;
    requires org.apache.commons.codec;
    requires org.apache.httpcomponents.httpclient;
    requires plexus.utils;
    requires javax.json.api;
    requires org.apache.httpcomponents.httpcore;

    exports com.oracle.javafx.scenebuilder.kit;
    exports com.oracle.javafx.scenebuilder.kit.alert;
    exports com.oracle.javafx.scenebuilder.kit.editor;
    exports com.oracle.javafx.scenebuilder.kit.editor.job;
    exports com.oracle.javafx.scenebuilder.kit.editor.job.reference;
    exports com.oracle.javafx.scenebuilder.kit.editor.messagelog;
    exports com.oracle.javafx.scenebuilder.kit.editor.panel.content;
    exports com.oracle.javafx.scenebuilder.kit.editor.panel.css;
    exports com.oracle.javafx.scenebuilder.kit.editor.panel.hierarchy;
    exports com.oracle.javafx.scenebuilder.kit.editor.panel.info;
    exports com.oracle.javafx.scenebuilder.kit.editor.panel.inspector;
    exports com.oracle.javafx.scenebuilder.kit.editor.panel.inspector.editors;
    exports com.oracle.javafx.scenebuilder.kit.editor.panel.library;
    exports com.oracle.javafx.scenebuilder.kit.editor.panel.library.manager;
    exports com.oracle.javafx.scenebuilder.kit.editor.panel.util;
    exports com.oracle.javafx.scenebuilder.kit.editor.panel.util.dialog;
    exports com.oracle.javafx.scenebuilder.kit.editor.search;
    exports com.oracle.javafx.scenebuilder.kit.editor.selection;
    exports com.oracle.javafx.scenebuilder.kit.editor.util;
    exports com.oracle.javafx.scenebuilder.kit.fxom;
    exports com.oracle.javafx.scenebuilder.kit.i18n;
    exports com.oracle.javafx.scenebuilder.kit.library;
    exports com.oracle.javafx.scenebuilder.kit.library.user;
    exports com.oracle.javafx.scenebuilder.kit.library.util;
    exports com.oracle.javafx.scenebuilder.kit.metadata;
    exports com.oracle.javafx.scenebuilder.kit.metadata.property;
    exports com.oracle.javafx.scenebuilder.kit.metadata.util;
    exports com.oracle.javafx.scenebuilder.kit.preferences;
    exports com.oracle.javafx.scenebuilder.kit.preview;
    exports com.oracle.javafx.scenebuilder.kit.selectionbar;
    exports com.oracle.javafx.scenebuilder.kit.skeleton;
    exports com.oracle.javafx.scenebuilder.kit.template;
    exports com.oracle.javafx.scenebuilder.kit.util;
    exports com.oracle.javafx.scenebuilder.kit.util.control.effectpicker;
    exports com.oracle.javafx.scenebuilder.kit.util.control.paintpicker;
//    exports com.oracle.javafx.scenebuilder.kit.editor.job;
}