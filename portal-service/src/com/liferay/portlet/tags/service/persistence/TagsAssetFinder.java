/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.tags.service.persistence;

/**
 * <a href="TagsAssetFinder.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public interface TagsAssetFinder {
	public int countByAndEntryIds(long groupId, long[] classNameIds,
		long[] entryIds, long[] notEntryIds, boolean excludeZeroViewCount,
		java.util.Date publishDate, java.util.Date expirationDate)
		throws com.liferay.portal.SystemException;

	public int countByOrEntryIds(long groupId, long[] classNameIds,
		long[] entryIds, long[] notEntryIds, boolean excludeZeroViewCount,
		java.util.Date publishDate, java.util.Date expirationDate)
		throws com.liferay.portal.SystemException;

	public java.util.List findByAndEntryIds(long groupId, long[] classNameIds,
		long[] entryIds, long[] notEntryIds, java.lang.String orderByCol1,
		java.lang.String orderByCol2, java.lang.String orderByType1,
		java.lang.String orderByType2, boolean excludeZeroViewCount,
		java.util.Date publishDate, java.util.Date expirationDate, int begin,
		int end) throws com.liferay.portal.SystemException;

	public java.util.List findByOrEntryIds(long groupId, long[] classNameIds,
		long[] entryIds, long[] notEntryIds, java.util.Date publishDate,
		java.util.Date expirationDate)
		throws com.liferay.portal.SystemException;

	public java.util.List findByOrEntryIds(long groupId, long[] classNameIds,
		long[] entryIds, long[] notEntryIds, java.lang.String orderByCol1,
		java.lang.String orderByCol2, java.lang.String orderByType1,
		java.lang.String orderByType2, boolean excludeZeroViewCount,
		java.util.Date publishDate, java.util.Date expirationDate, int begin,
		int end) throws com.liferay.portal.SystemException;

	public java.util.List findByViewCount(long[] classNameId, boolean asc,
		int begin, int end) throws com.liferay.portal.SystemException;
}