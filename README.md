## 01. Christmas Tree

<table>
  <tr>
    <td align="center" valign="top">
      <img src="./screenshorts/christmas-tree.png"
           width="250" alt="Christmas Tree Pattern">
    </td>
    <td align="center" valign="top">
      <img src="./screenshorts/image.png"
           width="250" alt="Christmas Tree Logic">
    </td>
    <td valign="top">
      <h3>Logic</h3>
      <ul>
        <li>Created 3 pyramids of increasing heights using separate methods.</li>
        <li>Added leading spaces to align the pyramid sections.</li>
        <li>Used nested loops to print spaces and stars.</li>
        <li>Star formula: <code>2 * i - 1</code>.</li>
        <li>Trunk created using fixed spaces and stars.</li>
      </ul>

      Dry Run: 1, 3, 5, 7, 9...
      Complexity: Time O(n²), Auxiliary Space O(1).
      Key takeaway: Combine patterns and align them with spaces.
    
  </tr>
</table>


## 02. Heart Pattern

<table>
  <tr>
    <td align="center" valign="top">
      <img src="./screenshorts/heart.png"
           width="250" alt="Heart Pattern">
    </td>
    <td align="center" valign="top">
      <img src="./screenshorts/heart-logic.png"
           width="250" alt="Heart Pattern Logic">
    </td>
    <td valign="top">
      <h3>Logic</h3>
      <ul>
        <li>Used nested loops to print spaces and stars.</li>
        <li>Created the top using 2 upright triangles.</li>
        <li>Decreased the middle gap on each row.</li>
        <li>Used 1 inverted triangle for the bottom.</li>
        <li>Star formula: <code>2 * i - 1</code>.</li>
      </ul>

      Dry Run: 1, 3, 5... and 13, 11, 9...
      Complexity: Time O(n²), Auxiliary Space O(1).
      Key takeaway: Combine 3 triangles to create a heart.
    
  </tr>
</table>


