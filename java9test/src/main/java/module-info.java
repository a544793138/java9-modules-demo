/*
 * 有这个 module-info.java，依然需要在 pom.xml 中表明依赖 java9demo。
 * 区别在于，这里有 module-info.java 表示使用了 java9 的模块化特性，表示将会按照 java9demo 模块中的 module-info.java 描述的可用情况。
 * 如果删掉这里的 module-info.java，那么表示这个模块不按模块化运行，java9demo 还是全部内容可用。
 */
module java9test {
    requires java9demo;
}