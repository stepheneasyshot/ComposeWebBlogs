package com.stephen.techblog.data

const val githubPage = "https://github.com/stepheneasyshot"
const val csdnPage = "https://blog.csdn.net/weixin_43240212?spm=1010.2135.3001.5343"
const val juejinPage = "https://juejin.cn/user/1227473764497976"

const val longMarkDown = "# 第一个Android应用学习记录\n" +
        "\n" +
        "#### xmlns\n" +
        "xmlns 是主节点的namespace命名空间的意思，告诉内部语句可以使用哪些合法的属性参数.\n" +
        "\n" +
        "```xml\n" +
        "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    android:gravity=\"center\"\n" +
        "    android:orientation=\"vertical\">\n" +
        "\n" +
        "    <TextView\n" +
        "        android:id=\"@+id/tv\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:text=\"Hello World!\" />\n" +
        "\n" +
        "    <Button\n" +
        "        android:id=\"@+id/button\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:text=\"跳转\"/>\n" +
        "\n" +
        "</LinearLayout>\n" +
        "```\n" +
        "\n" +
        "* wrap_content：包裹内容，方框的长宽随内容多少而变化。\n" +
        "* id不是必需的，在Java源码中需要find的则需要设置id\n" +
        "* xml文件就是在主节点里写子空间，叶子节点\n" +
        "\n" +
        "#### ImageView的填充方式\n" +
        "设置ImageView填充方式的前提是使用src作为设置图片的来源，否则的话，会导致图片填充方式设置无效的情况。\n" +
        "\n" +
        "* scaleType-“matrix”是保持原图大小、从左上角的点开始，以矩阵形式绘图。\n" +
        "* scaleType-“fitXY”是将原图进行横方向(即XY方向)的拉伸后绘制的。\n" +
        "* scaleType-“fitstart”是将原图沿左上角的点(即matrix方式绘图开始的点)，按比例缩放原图绘制而成的。\n" +
        "* scaleType-“fitcenter”是将原图沿上方居中的点(即matrix方式绘图第一行的居中的点)，按比例缩放原图绘制而成的。\n" +
        "* scaleType=“fitEnd”是将原图沿下方居中的点(即matrix方式绘图最后一行的居中的点)，按比例缩放原图绘制而成的。\n" +
        "* scaleType=“Center”是保持原图大小，以原图的几何中心点和ImagView的几何中心点为基准只绘制ImagView大小的图像。\n" +
        "* scaleType=“centerCrop”不保持原图大小，以原图的几何中心点和lmagView的几何中心点为基准，只绘制ImagView大小的图像(以填满lmagView为目标，对原图进行裁剪)\n" +
        "* scaleType=“centerlnside”不保持原图大小，以原图的几何中心点和lmagView的几何中心点为基准，只绘制ImagView大小的图像(以显示完整图片为目标，对原图进行缩放)\n" +
        "\n" +
        "#### 完整的页面创建过程包括三个步骤\n" +
        "\n" +
        "* 在layout目录下创建XML文件\n" +
        "* 创建与XML文件对应的Java代码\n" +
        "* 在AndroidManifest.xml 中注册页面配置\n" +
        "\n" +
        "```xml\n" +
        "   <activity\n" +
        "            android:name=\".NewActivity\"\n" +
        "            android:exported=\"false\" />\n" +
        "        <activity\n" +
        "            android:name=\".MainActivity\"\n" +
        "            android:exported=\"true\"\n" +
        "            android:theme=\"@style/Theme.ComposeDemo\">\n" +
        "            <intent-filter>\n" +
        "                <action android:name=\"android.intent.action.MAIN\" />\n" +
        "\n" +
        "                <category android:name=\"android.intent.category.LAUNCHER\" />\n" +
        "            </intent-filter>\n" +
        "        </activity>\n" +
        "```\n" +
        "\n" +
        "每次手动创建一个新的activity都要在清单文件中注册一下\n" +
        "\n" +
        "或者，可以在new里面一键生成activity，清单文件也注册好了\n" +
        "\n" +
        "##### 设置文本\n" +
        "\n" +
        "\n" +
        "* 在 XML 文件中通过属性 android:text 设置文本\n" +
        "* 在 Java 代码中调用文本视图对象的 setText 方法设置文本\n" +
        "\n" +
        "#### 设置文本大小\n" +
        "\n" +
        "（1）在Java代码中调节字体大小\n" +
        "\n" +
        "```java\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(@Nullable Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_main);\n" +
        "        TextView tv_hello = findViewById(R.id.tv hello);\n" +
        "        tv_hello.setTextSize(40);\n" +
        "    }\n" +
        "```\n" +
        "\n" +
        "（2）在xml文件里直接设置textsize\n" +
        "\n" +
        "```xml\n" +
        "android:text=\"40sp\"\n" +
        "```\n" +
        "\n" +
        "#### 字体大小单位\n" +
        "* 使用sp作为字体大小单位,会随着系统的字体大小改变\n" +
        "* 而dp作为单位则不会随之改变\n" +
        "\n" +
        "通常情况下,我们还是建议使用sp作为字体的单位,除非一些特殊的情况,不想跟随系统字体变化的,可以使用dp.\n" +
        "\n" +
        "#### 字体颜色设置\n" +
        "同样有两种设置方式\n" +
        "\n" +
        "```java\n" +
        "@Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_main2);\n" +
        "        TextView tv_hello = findViewById(R.id.tv_hello);\n" +
        "        tv_hello.setTextColor(Color.BLUE);\n" +
        "        //第一种是在Java代码中获取对象再进行设置\n" +
        "    }\n" +
        "```\n" +
        "\n" +
        "```xml\n" +
        "<TextView\n" +
        "        android:id=\"@+id/tv_hello\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:text=\"@string/hello\"\n" +
        "        android:textSize=\"40sp\"\n" +
        "        android:textColor=\"@color/purple_200\"/>\n" +
        "```\n" +
        "\n" +
        "#### 3秒自动跳转界面的代码\n" +
        "\n" +
        "```java\n" +
        "package com.example.zhanfeng_android;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "\n" +
        "import android.content.Intent;\n" +
        "import android.graphics.Color;\n" +
        "import android.os.Bundle;\n" +
        "import android.os.Handler;\n" +
        "import android.os.Looper;\n" +
        "import android.widget.TextView;\n" +
        "\n" +
        "public class Helloworld extends AppCompatActivity {\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onResume(){\n" +
        "        super.onResume();\n" +
        "        goNextPage();\n" +
        "    }\n" +
        "\n" +
        "    private void goNextPage(){\n" +
        "        TextView tv_hello = findViewById(R.id.tv_hello);\n" +
        "        tv_hello.setText(\"3秒后自动跳转下一界面\");\n" +
        "        new Handler(Looper.myLooper()).postDelayed(mGoNext, 3000);\n" +
        "\n" +
        "    }\n" +
        "\n" +
        "    private Runnable mGoNext = new Runnable(){\n" +
        "        @Override\n" +
        "        public void run(){\n" +
        "            startActivity(new Intent(Helloworld.this, NewPage.class));\n" +
        "        }\n" +
        "    };\n" +
        "\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_main2);\n" +
        "    }\n" +
        "}\n" +
        "```\n" +
        "\n" +
        "所有看得到的控件都可以叫做视图，视图尺寸的设置\n" +
        "\n" +
        "视图宽度通过属性android:layout_width表达，视图高度通过属性android:layout_height表达，宽高的取值主要有下列三种:\n" +
        "\n" +
        "* match_parent:表示与上级视图保持一致。\n" +
        "* wrap_content:表示与内容自适应,\n" +
        "* 以dp为单位的具体尺寸。\n" +
        "\n" +
        "自适应的内容不可超出上级视图，否则会出异常\n" +
        "\n" +
        "要在Java代码中设置宽高，需要先将xml中属性设为wrap_content\n" +
        "\n" +
        "#### 视图间距\n" +
        "* margin为当前的视图和它的平级视图之间的距离\n" +
        "* padding为当前视图和其下级视图的间距\n" +
        "* padding为控件本身的边框和里面的内容的距离\n" +
        "\n" +
        "如果不设置方向就是四周的边框均设置距离\n" +
        "\n" +
        "举例：\n" +
        "\n" +
        "LinearLayout最好用的就是可以设置内部控件所占的比重。\n" +
        "在子控件里设置 ```android:layout_weight``` 可以设置控件占容器的比例\n" +
        "\n" +
        "\n" +
        "#### LinearLayout（线性布局）\n" +
        "\n" +
        "以水平或垂直方向排列子视图。\n" +
        "通过android:orientation属性设置排列方向。\n" +
        "子视图可以通过android:layout_weight属性设置权重，以实现按比例分配空间。\n" +
        "\n" +
        "#### RelativeLayout（相对布局）\n" +
        "\n" +
        "允许子视图相对于其他子视图或父视图进行定位。\n" +
        "通过android:layout_alignParentTop、android:layout_toLeftOf等属性设置相对位置。\n" +
        "\n" +
        "#### FrameLayout（帧布局）\n" +
        "\n" +
        "所有子视图都堆叠在左上角，后添加的子视图会覆盖前面的子视图。\n" +
        "通常用于实现叠加效果，如地图上的标记。\n" +
        "\n" +
        "#### TableLayout（表格布局）\n" +
        "\n" +
        "以表格形式排列子视图，类似于HTML中的<table>标签。\n" +
        "通过android:stretchColumns属性设置可拉伸的列。\n" +
        "\n" +
        "#### GridLayout（网格布局）\n" +
        "\n" +
        "将子视图放置在网格中，可以指定行列数。\n" +
        "通过android:layout_row和android:layout_column属性设置子视图的位置。\n" +
        "\n" +
        "#### ConstraintLayout（约束布局）\n" +
        "\n" +
        "以相对位置和约束条件来排列子视图。\n" +
        "每个子视图至少需要两个方向的约束，可以通过app:layout_constraintStart_toEndOf等属性设置约束。\n" +
        "\n" +
        "\n" +
        "#### tools命名空间\n" +
        "android的text和tools的text区分。tools是调试时的工具，而android才是运行时实际显示的。\n" +
        "\n" +
        "```\n" +
        "    <TextView\n" +
        "        android:layout_width=\"match_parent\"\n" +
        "        android:layout_height=\"match_parent\"\n" +
        "        android:text=\"real\"\n" +
        "        tools:text=\"test_text\" />\n" +
        "```\n" +
        "\n" +
        "#### 对齐方式\n" +
        "单独一个gravity是设置下属视图\n" +
        "\n" +
        "而layout_gravity是设置自己在父布局中的对齐方式\n" +
        "\n" +
        "实例演示，对比代码和界面来看。\n" +
        "\n" +
        "#### 布局页面的嵌套\n" +
        "\n" +
        "```xml\n" +
        "    <include layout=\"@layout/fragment_app_detail\"/>\n" +
        "```\n" +
        "\n" +
        "#### xml文件本质\n" +
        "\n" +
        "xml布局文件中的一个个view节点，最终也是会被解析成java代码类采用xml方式进行布局，只不过是为了方便我们开发者进行直观的布局。\n" +
        "\n" +
        "其实也可以直接用Java代码来写和修改布局。\n" +
        "\n" +
        "#### git插入技巧\n" +
        "查看最近提交的版本号：git reflog\n" +
        "回退到历史版本：git reset --hard ad2080c\n" +
        "\n" +
        "\n" +
        "#### 应用权限声明\n" +
        "都要在manifest文件中进行标注\n" +
        "\n" +
        "\n" +
        "#### Java和xml布局文件是怎样关联的\n" +
        "\n" +
        "检查Manifest文件，找到的启动页面MainActivity。\n" +
        "\n" +
        "MainActivity调用onCreate方法-->调用setContentView方法-->R.layout.activity_main找到布局文件。\n" +
        "\n" +
        "#### Gradle文件分析\n" +
        "\n" +
        "新手在工程方面碰到的错误很多和gradle文件有关\n" +
        "Gradle是什么，有什么作用？\n" +
        "编译，打包安卓工程的一个工具\n" +
        "Project中的Module\n" +
        "\n" +
        "#### 项目级里的Gradle插件版本和Gradle版本的匹配关系要对应\n" +
        "\n" +
        "插件版本7.2，那么Gradle版本需要7.3.3以上\n" +
        "\n" +
        "![gradle](/assets/img/blog/blogs_gradle_and_plugins.png)\n" +
        "\n" +
        "而模组级的Gradle文件主要关注其依赖项\n" +
        "\n" +
        "```kotlin\n" +
        "android {\n" +
        "    namespace = \"com.stephen.redfindemo\"\n" +
        "    compileSdk = 34\n" +
        "\n" +
        "    defaultConfig {\n" +
        "        applicationId = \"com.stephen.redfindemo\"\n" +
        "        minSdk = 30\n" +
        "        targetSdk = 34\n" +
        "        versionCode = 32\n" +
        "        versionName = \"2.1.0\"\n" +
        "        testInstrumentationRunner = \"androidx.test.runner.AndroidJUnitRunner\"\n" +
        "    }\n" +
        "}\n" +
        "```\n" +
        "\n" +
        "其中各个参数的意义：compileSdkVersion，minSdkVersion，targetSdkVersion，build ToolsVersion \n" +
        "\n" +
        "* compileSdkVersion 是编译代码所使用的sdk 版本，并且与sdk manager 里面下载的那些sdk platforms是对应的。也就是说，compileSdk Version使用的版本，在sdk manager 里面必须是已经下载了才能用。最新的as做了优化，即使你没有下，当写上某个版本后，as会自动帮你下载。\n" +
        "* minSdkVersion 是对app可运行的手机设备的最小版本限制。与sdk manager里面下载的东西无关，只是一个标识而已。\n" +
        "* targetSdkVersion 是对app要运行的手机设备的目标版本的标识，也与sdk manager 里面下载的东西无关，标识了该app是为某个版本的手机设备而设计的，在这个目标版本的手机上做了充分的测试。\n" +
        "\n" +
        "当你的手机版本大于这个目标版本时，该app也能运行。因为高版本的手机是可以运行低版本软件的。这也符合常理，越先进的手机功能应该越强大嘛，不仅能运行新东西，也能兼容老东西。\n" +
        "\n" +
        "因此，minSdkVersion 和targetSdkVersion是对我们开发的app所能运行设备的系统版本的范围约束。最低不能小于minSdkVersion，但没有最高限制。原因上面已经说了，高版本手机可以运行低版本软件嘛。从名字上也可以理解，它叫targetSdkVersion 而没有叫maxSdk Version\n" +
        "\n" +
        "build ToolsVersion 是独立出来的一个东西，和上面三个都没关系，就是构建代码的工具的版本。\n" +
        "与sdk manager 里面的sdk tools 下载的东西是对应的。要想使用某个版本，必须得已经下载了对应的sdk Build-tools。\n" +
        "\n" +
        "重要关系：minSdkVersion <= targetSdkVersion <= compileSdkVersion\n" +
        "\n" +
        "\n" +
        "#### RecyclerView使用流程\n" +
        "首先，在页面里添加recyclerview控件\n" +
        "\n" +
        "```xml\n" +
        "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    tools:context=\".MainActivity\">\n" +
        "\n" +
        "\n" +
        "    <androidx.recyclerview.widget.RecyclerView\n" +
        "        android:id=\"@+id/recyclerview\"\n" +
        "        android:layout_width=\"match_parent\"\n" +
        "        android:layout_height=\"wrap_content\" />\n" +
        "\n" +
        "</LinearLayout>\n" +
        "```\n" +
        "\n" +
        "第二步，写item的xml控件，以通讯录为例，需要添加一个装头像的ImageView，一个姓名TextView，一个电话号码TextView\n" +
        "\n" +
        "```xml\n" +
        "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<LinearLayout\n" +
        "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    android:orientation=\"horizontal\">\n" +
        "\n" +
        "<LinearLayout\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"wrap_content\">\n" +
        "\n" +
        "    <ImageView\n" +
        "        android:id=\"@+id/imageView\"\n" +
        "        android:layout_width=\"80dp\"\n" +
        "        android:layout_height=\"80dp\"\n" +
        "        android:src=\"@drawable/head\"/>\n" +
        "\n" +
        "    <LinearLayout\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"match_parent\"\n" +
        "        android:orientation=\"vertical\">\n" +
        "        <TextView\n" +
        "            android:id=\"@+id/textView\"\n" +
        "            android:layout_width=\"wrap_content\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:layout_weight=\"2\"\n" +
        "            android:textSize=\"30sp\"/>\n" +
        "\n" +
        "        <TextView\n" +
        "            android:id=\"@+id/textView2\"\n" +
        "            android:layout_width=\"wrap_content\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:layout_weight=\"1\"\n" +
        "            android:textSize=\"20sp\"/>\n" +
        "    </LinearLayout>\n" +
        "</LinearLayout>\n" +
        "\n" +
        "</LinearLayout>\n" +
        "```\n" +
        "\n" +
        "第三步定义一个Person类，添加姓名，电话的String，还有头像的ID，自动生成构造器和getter，setter\n" +
        "第四步写MyAdapter类，继承自RecyclerView.Adapter，覆写以下三个方法\n" +
        "\n" +
        "```java\n" +
        "@NonNull\n" +
        "    @Override\n" +
        "    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {\n" +
        "        return null;\n" +
        "    }\n" +
        "\n" +
        "    @Override\n" +
        "    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {\n" +
        "\n" +
        "    }\n" +
        "\n" +
        "    @Override\n" +
        "    public int getItemCount() {\n" +
        "        return 0;\n" +
        "    }\n" +
        "```\n" +
        "\n" +
        "然后再在里面写MyViewHolder类，继承自RecyclerView.ViewHolde，这个类用于装来自item里的控件。\n" +
        "\n" +
        "```java\n" +
        "class MyViewHolder extends RecyclerView.ViewHolder{ \n" +
        "        TextView nametext;\n" +
        "        TextView phoneText;\n" +
        "        ImageView head;\n" +
        "\n" +
        "        public MyViewHolder(View itemView) {    //传View对象即可\n" +
        "            super(itemView);    //调用super方法\n" +
        "            this.nametext = itemView.findViewById(R.id.textView);\n" +
        "            this.phoneText = itemView.findViewById(R.id.textView2);\n" +
        "            this.head = itemView.findViewById(R.id.imageView);\n" +
        "        }\n" +
        "\n" +
        "    }\n" +
        "```\n" +
        "\n" +
        "#### fragment的使用\n" +
        "fragment是将屏幕中的控件集中统一管理，所以本身可以直接作为页面来使用。\n" +
        "\n" +
        "使用示例：\n" +
        "\n" +
        "第一，建立新的空白fragment\n" +
        "\n" +
        "第二，fragment的页面解析方式和activity有点不同，需要用到inflate，在xml里写完界面之后，传到view类\n" +
        "\n" +
        "第三，fragment里对于文本和按钮处理方式和activity相同。\n" +
        "\n" +
        "第四，在activity的xml文件里添加fragment控件，id必须添加。\n" +
        "\n" +
        "以按钮进行多界面切换，fragment管理器的使用\n" +
        "\n" +
        "```java\n" +
        "private void replaceFragment(Fragment fragment){\n" +
        "    FragmentManager fragmentManager = getSupportFragmentManager();\n" +
        "    FragmentTransaction transaction = fragmentManager.beginTransaction();\n" +
        "    transaction.replace(R.id.fragment_container, fragment);\n" +
        "    transaction.commit();\n" +
        "}\n" +
        "```\n" +
        "\n" +
        "最后一定要commit才能生效.\n" +
        "\n" +
        "\n" +
        "\n" +
        "#### activity和fragment的通信\n" +
        "\n" +
        "使用bundle类来传递，键值对的形式存储信息。\n" +
        "在fragment的java代码里，使用getarguments()来接收信息，获得的是bundle对象实例。从中解析数据。\n" +
        "\n" +
        "\n" +
        "#### 动态添加fragment的小结\n" +
        "\n" +
        "* 创建一个待处理的fragment\n" +
        "* 获取FragmentManager，一般都是通过getSupportFragmentManager()\n" +
        "* 开启一个事务 transaction，一般调用fragmentManager的beginTransaction()\n" +
        "* 使用transaction进行fragment的替换\n" +
        "* 提交事务\n" +
        "\n" +
        "#### Android的数据存储\n" +
        "\n" +
        "SharedPreferences\n" +
        ">    SharedPreferences是Android平台上一个轻量级的存储类，用来保存应用的一些常用配置，比如Activity状态，Activity暂停时，将此activity的状态保存到SharedPereferences中；当Activity重载，系统回调方法onSaveInstanceState时，再从SharedPreferences中将值取出。SharedPreferences提供了java常规的Long、Int、String等类型数据的保存接口。SharedPreferences类似过去Windows系统上的ini配置文件，但是它分为多种权限，可以全局共享访问。提示最终是以xml方式来保存，整体效率来看不是特别的高，对于常规的轻量级而言比SQLite要好不少，如果真的存储量不大可以考虑自己定义文件格式。该xml在应用程序私有目录下，其他程序无法访问。\n" +
        "\n" +
        "\n" +
        "#### 使用Handler处理多线程之间的信息传递\n" +
        "\n" +
        "了解了Message、Handler、MessageQueue以及Looper的基本概念后，我们再来把异步消息处理的整个流程梳理一遍。首先需要在主线程当中创建一个Handler对象，并重写handleMessage( )方法。然后当子线程中需要进行UI操作时，就创建一个Message对象，并通过Handler将这条消息发送出去。之后这条消息会被添加到MessageQueue的队列中等待被处理，而Looper则会一直尝试从MessageQueue中取出待处理消息，最后分发回Handler的handleMessage ( )方法中。由于Handler是在主线程中创建的，所以此时 handleMessage( )方法中的代码也会在主线程中运行，于是我们在这里就可以安心地进行UI操作了。整个异步消息处理机制的流程示意图如下图所示。\n" +
        "\n" +
        "#### JSON数据解析\n" +
        "\n" +
        "* JSONObject 表示一个JSON节点\n" +
        "* JSONObject.opt(\"key\")根据键获取值，如果没找到匹配的键，则返回空。(推荐)\n" +
        "* JSONObject.get(“key\")根据键获取值，如果没找到匹配的键，则抛出异常。\n" +
        "\n" +
        "根据值的类型获取:\n" +
        "\n" +
        "* JSONObject.optString(\"key”)\n" +
        "* JSONObject.optInt(“key\")\n" +
        "* JSONObject.optBoolean(\"key\")\n" +
        "* JSONObject.optJsONObject(\"key\")\n" +
        "* JSONObject.optJSONArray(\"key\")\n"