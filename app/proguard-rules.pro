# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

# Firebase
-keepattributes *Annotation*
-keepattributes Signature
-keepattributes Exceptions
-keepattributes InnerClasses
-keepattributes EnclosingMethod

# Glide
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep public class * extends com.bumptech.glide.module.AppGlideModule
-keep public enum com.bumptech.glide.load.ImageHeaderParser$** {
  **[] $VALUES;
  public *;
}

# Retrofit
-keep class retrofit2.** { *; }
-keepattributes Signature
-keepattributes Exceptions
-keepattributes *Annotation*

# Gson
-keep class com.google.gson.** { *; }
-keep class com.google.gson.annotations.** { *; }
-keep class * extends com.google.gson.TypeAdapter
-keep class * implements com.google.gson.JsonSerializer
-keep class * implements com.google.gson.JsonDeserializer

# Firebase Auth
-keep class com.google.firebase.auth.** { *; }

# Firebase Firestore
-keep class com.google.firebase.firestore.** { *; }

# Hilt
-keep class * extends dagger.internal.Binding
-keep class * extends dagger.internal.ModuleAdapter
-keep class * extends dagger.internal.StaticInjection

# Navigation
-keep class androidx.navigation.fragment.NavHostFragment
-keep class androidx.navigation.ui.NavigationUI

# Data classes
-keep class com.foodorderingapp.domain.model.** { *; }

# ViewModels
-keep class * extends androidx.lifecycle.ViewModel {
    public <init>(...);
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * implements android.os.Parcelable {
    public static final ** CREATOR;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * implements java.io.Serializable {
    static final long serialVersionUID;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...);
    public <fields>;
    public <methods>;
}

# Keep the names of classes and methods that are used by reflection
-keepnames class * {
    public <init>(...
