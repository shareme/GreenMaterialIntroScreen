/*
 MIT License

Copyright (c) 2016 Tango Agency
Modifications Copyright(C) 2016 Fred Grott(GrottWorkShop)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

 */
package com.github.shareme.greenmaterialintroscreen.library;

import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;

public class SlideFragmentBuilder {
    int backgroundColor;
    int buttonsColor;
    String title;
    String description;
    String[] neededPermissions;
    String[] possiblePermissions;
    int image;

    public SlideFragmentBuilder backgroundColor(@ColorRes int backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public SlideFragmentBuilder buttonsColor(@ColorRes int buttonsColor) {
        this.buttonsColor = buttonsColor;
        return this;
    }

    public SlideFragmentBuilder title(String title) {
        this.title = title;
        return this;
    }

    public SlideFragmentBuilder description(String description) {
        this.description = description;
        return this;
    }

    public SlideFragmentBuilder neededPermissions(String[] neededPermissions) {
        this.neededPermissions = neededPermissions;
        return this;
    }

    public SlideFragmentBuilder possiblePermissions(String[] possiblePermissions) {
        this.possiblePermissions = possiblePermissions;
        return this;
    }

    public SlideFragmentBuilder image(@DrawableRes int image) {
        this.image = image;
        return this;
    }

    public SlideFragment build() {
        return SlideFragment.createInstance(this);
    }
}
