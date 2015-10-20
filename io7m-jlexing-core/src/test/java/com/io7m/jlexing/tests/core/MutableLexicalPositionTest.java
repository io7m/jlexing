/*
 * Copyright © 2015 <code@io7m.com> http://io7m.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.io7m.jlexing.tests.core;

import com.io7m.jlexing.core.MutableLexicalPosition;
import com.io7m.jlexing.core.MutableLexicalPositionType;

public final class MutableLexicalPositionTest
  extends MutableLexicalPositionContract<String,
  MutableLexicalPositionType<String>>
{
  @Override protected MutableLexicalPositionType<String> newPositionFrom(
    final MutableLexicalPositionType<String> x)
  {
    return MutableLexicalPosition.newFrom(x);
  }

  @Override protected MutableLexicalPositionType<String> newPosition()
  {
    return MutableLexicalPosition.newPosition(0, 0);
  }

  @Override protected MutableLexicalPositionType<String> newPositionLC(
    final int line,
    final int column)
  {
    return MutableLexicalPosition.newPosition(line, column);
  }

  @Override protected MutableLexicalPositionType<String> newPositionLCWith(
    final int line,
    final int column,
    final String s)
  {
    return MutableLexicalPosition.newPositionWithFile(line, column, s);
  }

  @Override
  protected MutableLexicalPositionType<String> newPositionWith(final String s)
  {
    return MutableLexicalPosition.newPositionWithFile(0, 0, s);
  }

  @Override protected String newFile(final String name)
  {
    return name;
  }
}
