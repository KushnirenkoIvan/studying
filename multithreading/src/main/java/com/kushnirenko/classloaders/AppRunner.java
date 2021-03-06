package com.kushnirenko.classloaders;


import com.kushnirenko.classloaders.plugins.Plugin;

import java.io.IOException;

public class AppRunner {

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        /**
         * Getting class loader was loaded AppRunner.class.
         */
        PluginClassLoader loader = new PluginClassLoader(AppRunner.class.getClassLoader());

        loader.loadPlugins();

        Plugin plugin = (Plugin) loader.loadClass("com.kushnirenko.loaders.plugins.PluginImpl").newInstance();
        plugin.run();
    }

}
