## 01. Christmas Tree

<table>
  <tr>
    <td align="center" valign="top">
      <img src="./screenshorts/christmas-tree.png"
           width="300" alt="Christmas Tree Pattern">
    </td>
    <td align="center" valign="top">
      <img src="./screenshorts/tree-logic.png"
           width="300" alt="Christmas Tree Logic">
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
           width="300" alt="Heart Pattern">
    </td>
    <td align="center" valign="top">
      <img src="./screenshorts/heart-logic.png"
           width="300" alt="Heart Pattern Logic">
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

## 03. Diya Pattern

<table>
  <tr>
    <td align="center" valign="top">
      <img src="./screenshorts/diya.png" width="300" alt="Diya Pattern">
    </td>
    <td align="center" valign="top">
      <img src="./screenshorts/diya-logic.png" width="300" alt="Diya Logic">
    </td>
    <td valign="top">
      <h3>Logic</h3>
      <ul>
        <li>Divided the pattern into 3 parts.</li>
        <li>Combined the left section, diamond, and inverted triangle.</li>
        <li>Used spaces to align all parts.</li>
      </ul>
      <b>Formulas:</b>
      <ul>
        <li>Spaces: <code>n - i</code></li>
        <li>Stars: <code>2 * i - 1</code></li>
      </ul>
      
      Dry Run: Stars: 1, 3, 5, 7... | Spaces decrease as rows increase.
      Complexity: Time O(n²), Auxiliary Space O(1).
      Key takeaway: Combine smaller patterns to create one design.
    
  </tr>
</table>

## 04. Hollow X Pattern

<table>
  <tr>
    <td align="center" valign="top">
      <img src="./screenshorts/hollow-x.png" width="300" alt="Hollow X Pattern">
    </td>
    <td align="center" valign="top">
<img src="./screenshorts/Hollow%20X%20Pattern%20Sketch%20Diagram.png"
     width="400" alt="Hollow X Pattern Logic">
    </td>
    <td valign="top">
      <h3>Logic</h3>
      <ul>
        <li>Divided the X into 2 hollow triangles.</li>
        <li>Combined their diagonal boundaries.</li>
        <li>Used conditions to print stars and spaces.</li>
        <li>Removed unwanted bottom corner stars.</li>
      </ul>
      <b>Formula:</b>
      <ul>
        <li>Inverted: <code>j == i || j == i + 1</code></li>
        <li>Upright: <code>j == n-1-i || j == n-2-i</code></li>
      </ul>
      <b>Dry Run:</b> Diagonal positions shift with each row.
      <p><b>Complexity:</b> Time O(n²), Space O(1).</p>
      <b>Key takeaway:</b> Combine two hollow triangles to create an X.
    </td>
  </tr>
</table>
