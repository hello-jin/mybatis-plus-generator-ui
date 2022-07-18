import com.github.davidfantasy.mybatisplus.generatorui.GeneratorConfig;
import com.github.davidfantasy.mybatisplus.generatorui.MybatisPlusToolsApplication;
import com.github.davidfantasy.mybatisplus.generatorui.mbp.NameConverter;

public class TestApplication {

    public static void main(String[] args) {


        //访问页面：http://localhost:8068/

        GeneratorConfig config = GeneratorConfig.builder().jdbcUrl("jdbc:mysql://192.168.1.195:3306/szgc")
                .userName("szgc")
                .password("eydlS11qPOmlhmyre3J1")
                .driverClassName("com.mysql.jdbc.Driver") // 低于5.8的驱动
                //  .driverClassName("com.mysql.cj.jdbc.Driver")
                //数据库schema，POSTGRE_SQL,ORACLE,DB2类型的数据库需要指定
                .schemaName("szgc")
                //如果需要修改各类生成文件的默认命名规则，可自定义一个NameConverter实例，覆盖相应的名称转换方法：
                .nameConverter(new NameConverter() {
                    /**
                     * 自定义Service类文件的名称规则
                     */
                    @Override
                    public String serviceNameConvert(String tableName) {
                        return this.entityNameConvert(tableName) + "Service";
                    }
                    /**
                     * 自定义Controller类文件的名称规则
                     */
                    @Override
                    public String controllerNameConvert(String tableName) {
                        return this.entityNameConvert(tableName) + "Controller";
                    }
                })
                // 包名定义
                .basePackage("com.icinfo.cloud.metadata.datastandard")
                .port(8068)
                .build();
        MybatisPlusToolsApplication.run(config);
    }




 /*   public static void main(String[] args) {
        GeneratorConfig config = GeneratorConfig.builder().jdbcUrl("jdbc:mysql://localhost:3306/testdb")
                .userName("root")
                .password("root")
                .port(8068)
                .driverClassName("com.mysql.cj.jdbc.Driver") // 驱动5.8以上
                .basePackage("com.github.davidfantasy.mybatisplus.generatorui.example")
                .nameConverter(new NameConverter() {
                    @Override
                    public String serviceNameConvert(String tableName) {
                        return this.entityNameConvert(tableName) + "Service";
                    }

                    @Override
                    public String controllerNameConvert(String tableName) {
                        return this.entityNameConvert(tableName) + "Action";
                    }
                })
                .build();
        MybatisPlusToolsApplication.run(config);
    }*/



}
