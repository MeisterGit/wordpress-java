/*
 * This file is part of jwordpress.
 *
 * jwordpress is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * jwordpress is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jwordpress.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.bican.wordpress;

/**
 * 
 * Status values for posts and pages
 * 
 * @author Can Bican <can@bican.net>
 * 
 */
public class PostAndPageStatus extends XmlRpcMapped implements StringHeader {
  String status;

  String description;

  /**
   * @return the status
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * @param status the status to set
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * @return the description
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * @param description the description to set
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * 
   * (non-Javadoc)
   * 
   * @see net.bican.wordpress.StringHeader#getStringHeader()
   */
  public String getStringHeader() {
    return "";
  }
}
