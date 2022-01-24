module java9demo {
    /*
     * 这表示整个 java9demo 模块，如果被别的地方引用作为依赖时，而且引用方也在 module-info.java 表明了自己的模块描述，
     * 那么引用方只能使用到这里暴露出来的 com.tjwoods.demo 包下的内容，但无法访问其他，例如 com.tjwoods.service 下的。
     *
     * 如果引用方没有 module-info.java，那么整个 java9demo 模块还是会全部可用
     */
    exports com.tjwoods.demo;
}