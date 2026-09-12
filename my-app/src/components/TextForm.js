import React, { useState } from 'react';
import PropTypes from 'prop-types';
import {
  Chart as ChartJS,
  CategoryScale,
  LinearScale,
  PointElement,
  LineElement,
  Title,
  Tooltip,
  Legend,
  Filler
} from 'chart.js';
import { Line } from 'react-chartjs-2';
import './TextForm.css';

// Register Chart.js components
ChartJS.register(
  CategoryScale,
  LinearScale,
  PointElement,
  LineElement,
  Title,
  Tooltip,
  Legend,
  Filler
);

export default function TextForm(props) {
  // Form and Text State
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [text, setText] = useState('Enter your text here...');
  const [readingSpeed, setReadingSpeed] = useState('130');
  const [typingSpeed, setTypingSpeed] = useState('60');
  const [feedbackMessage, setFeedbackMessage] = useState('');

  // Parsed Numerical Speeds (ensures safe fallback while allowing user to type freely)
  const numReadingSpeed = Math.max(1, parseInt(readingSpeed, 10) || 130);
  const numTypingSpeed = Math.max(1, parseInt(typingSpeed, 10) || 60);

  // Text Handlers
  const handleOnChange = (event) => {
    setText(event.target.value);
  };

  const handleUpClick = (e) => {
    e.preventDefault();
    setText(text.toUpperCase());
    showFeedback('Converted to uppercase');
  };

  const handleLowerClick = (e) => {
    e.preventDefault();
    setText(text.toLowerCase());
    showFeedback('Converted to lowercase');
  };

  const handleClearClick = (e) => {
    e.preventDefault();
    setText('');
    showFeedback('Text cleared');
  };

  const handleCopyClick = (e) => {
    e.preventDefault();
    if (navigator.clipboard && window.isSecureContext) {
      navigator.clipboard.writeText(text)
        .then(() => {
          showFeedback('Text copied to clipboard');
        })
        .catch(() => {
          fallbackCopyText(text);
        });
    } else {
      fallbackCopyText(text);
    }
  };

  const fallbackCopyText = (textToCopy) => {
    try {
      const tempTextArea = document.createElement('textarea');
      tempTextArea.value = textToCopy;
      tempTextArea.style.position = 'fixed';
      tempTextArea.style.left = '-9999px';
      tempTextArea.style.top = '0';
      document.body.appendChild(tempTextArea);
      tempTextArea.focus();
      tempTextArea.select();
      const successful = document.execCommand('copy');
      document.body.removeChild(tempTextArea);
      if (successful) {
        showFeedback('Text copied to clipboard');
      } else {
        showFeedback('Failed to copy text');
      }
    } catch (err) {
      showFeedback('Failed to copy text');
    }
  };

  const handleExtraSpaces = (e) => {
    e.preventDefault();
    const newText = text.split(/[ ]+/).join(' ');
    setText(newText);
    showFeedback('Extra spaces removed');
  };

  const showFeedback = (msg) => {
    setFeedbackMessage(msg);
    setTimeout(() => {
      setFeedbackMessage('');
    }, 2500);
  };

  const handleFormSubmit = (e) => {
    e.preventDefault();
    showFeedback('Form submitted successfully');
  };

  // Metric Calculations
  const wordsArray = text.trim().length === 0 ? [] : text.trim().split(/\s+/);
  const wordCount = wordsArray.length;
  const charCount = text.length;

  // Active Text Time Calculations
  const userReadingMinutes = parseFloat((wordCount / numReadingSpeed).toFixed(2));
  const benchmarkReadingMinutes = parseFloat((wordCount / 130).toFixed(2));

  const userTypingMinutes = parseFloat((wordCount / numTypingSpeed).toFixed(2));
  const benchmarkTypingMinutes = parseFloat((wordCount / 60).toFixed(2));
  const typingSpeedDiff = numTypingSpeed - 60;

  // Format minutes into clean readable strings
  const formatTimeMinutes = (mins) => {
    if (mins === 0) return '0.00 min';
    const totalSeconds = Math.round(mins * 60);
    const m = Math.floor(totalSeconds / 60);
    const s = totalSeconds % 60;
    if (m === 0) return `${s}s (${mins.toFixed(2)} min)`;
    return `${m}m ${s}s (${mins.toFixed(2)} min)`;
  };

  // Word Count Milestones for Charts
  const benchmarkMilestones = [500, 1000, 1500, 2000, 3000, 5000];
  const milestoneLabels = ['500', '1000', '1500', '2000', '3000', '5000'];

  // Reading Chart Datasets
  const redReadingBenchmark = benchmarkMilestones.map((m) =>
    parseFloat((m / 130).toFixed(2))
  );
  const blueReadingUserData = benchmarkMilestones.map((m) =>
    parseFloat((m / numReadingSpeed).toFixed(2))
  );

  const readingChartData = {
    labels: milestoneLabels,
    datasets: [
      {
        label: 'Average Human Benchmark (130 WPM)',
        data: redReadingBenchmark,
        borderColor: '#dc2626',
        backgroundColor: 'rgba(220, 38, 38, 0.08)',
        fill: true,
        tension: 0.3,
        borderWidth: 2.5,
        pointRadius: 4,
        pointHoverRadius: 6,
        pointBackgroundColor: '#dc2626',
        pointBorderColor: '#ffffff',
        pointBorderWidth: 2
      },
      {
        label: `Custom User Speed (${numReadingSpeed} WPM)`,
        data: blueReadingUserData,
        borderColor: '#0284c7',
        backgroundColor: 'rgba(2, 132, 199, 0.08)',
        borderDash: [5, 4],
        fill: true,
        tension: 0.3,
        borderWidth: 2.5,
        pointRadius: 4,
        pointHoverRadius: 6,
        pointBackgroundColor: '#0284c7',
        pointBorderColor: '#ffffff',
        pointBorderWidth: 2
      }
    ]
  };

  // Typing Chart Datasets
  const redTypingBenchmark = benchmarkMilestones.map((m) =>
    parseFloat((m / 60).toFixed(2))
  );
  const blueTypingUserData = benchmarkMilestones.map((m) =>
    parseFloat((m / numTypingSpeed).toFixed(2))
  );

  const typingChartData = {
    labels: milestoneLabels,
    datasets: [
      {
        label: 'Average Benchmark (60 WPM)',
        data: redTypingBenchmark,
        borderColor: '#dc2626',
        backgroundColor: 'rgba(220, 38, 38, 0.08)',
        fill: true,
        tension: 0.3,
        borderWidth: 2.5,
        pointRadius: 4,
        pointHoverRadius: 6,
        pointBackgroundColor: '#dc2626',
        pointBorderColor: '#ffffff',
        pointBorderWidth: 2
      },
      {
        label: `Custom User Speed (${numTypingSpeed} WPM)`,
        data: blueTypingUserData,
        borderColor: '#0284c7',
        backgroundColor: 'rgba(2, 132, 199, 0.08)',
        borderDash: [5, 4],
        fill: true,
        tension: 0.3,
        borderWidth: 2.5,
        pointRadius: 4,
        pointHoverRadius: 6,
        pointBackgroundColor: '#0284c7',
        pointBorderColor: '#ffffff',
        pointBorderWidth: 2
      }
    ]
  };

  // Shared Chart Options
  const getChartOptions = (chartTitle) => ({
    responsive: true,
    maintainAspectRatio: false,
    plugins: {
      legend: {
        position: 'top',
        align: 'end',
        labels: {
          font: {
            size: 12,
            weight: '600',
            family: "'Segoe UI', Tahoma, Geneva, Verdana, sans-serif"
          },
          padding: 16,
          usePointStyle: true,
          pointStyle: 'circle'
        }
      },
      title: {
        display: false,
        text: chartTitle
      },
      tooltip: {
        mode: 'index',
        intersect: false,
        backgroundColor: '#0f172a',
        titleFont: { size: 13, weight: '600' },
        bodyFont: { size: 12 },
        padding: 10,
        cornerRadius: 6,
        callbacks: {
          label: (context) => `${context.dataset.label}: ${context.parsed.y} minutes`
        }
      }
    },
    scales: {
      x: {
        title: {
          display: true,
          text: 'Word Count Milestones',
          font: { size: 12, weight: '600' },
          color: '#475569'
        },
        grid: {
          display: false
        },
        ticks: {
          color: '#64748b',
          font: { size: 11 }
        }
      },
      y: {
        title: {
          display: true,
          text: 'Time Required (Minutes)',
          font: { size: 12, weight: '600' },
          color: '#475569'
        },
        beginAtZero: true,
        grid: {
          color: '#f1f5f9'
        },
        ticks: {
          color: '#64748b',
          font: { size: 11 }
        }
      }
    }
  });

  return (
    <div className="textform-wrapper">
      {/* Contact Us Form Card */}
      <div className="textform-card">
        <div className="textform-header">
          <h1 className="h2 mb-1">{props.heading}</h1>
          <p className="text-muted mb-0">Fill in the fields below or analyze your text directly.</p>
        </div>

        <form onSubmit={handleFormSubmit}>
          {/* Email and Password Inputs */}
          <div className="row g-3 mb-3">
            <div className="col-md-6">
              <label htmlFor="emailInput" className="form-label">
                {props.emailLabel}
              </label>
              <input
                type="email"
                className="form-control"
                id="emailInput"
                placeholder="name@example.com"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
              />
            </div>
            <div className="col-md-6">
              <label htmlFor="passwordInput" className="form-label">
                Password
              </label>
              <input
                type="password"
                className="form-control"
                id="passwordInput"
                placeholder="Enter password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
              />
            </div>
          </div>

          {/* Text Area Input */}
          <div className="mb-3">
            <label htmlFor="textInput" className="form-label">
              {props.text}
            </label>
            <textarea
              className="form-control"
              id="textInput"
              rows="6"
              value={text}
              onChange={handleOnChange}
              placeholder="Type or paste your text here..."
            />
          </div>

          {/* Text Actions */}
          <div className="text-actions mb-3">
            <button
              type="button"
              className="btn btn-primary"
              onClick={handleUpClick}
            >
              Convert to Uppercase
            </button>
            <button
              type="button"
              className="btn btn-secondary"
              onClick={handleLowerClick}
            >
              Convert to Lowercase
            </button>
            <button
              type="button"
              className="btn btn-outline-secondary"
              onClick={handleExtraSpaces}
            >
              Remove Extra Spaces
            </button>
            <button
              type="button"
              className="btn btn-outline-dark"
              onClick={handleCopyClick}
            >
              Copy Text
            </button>
            <button
              type="button"
              className="btn btn-outline-danger"
              onClick={handleClearClick}
            >
              Clear Text
            </button>
          </div>

          {feedbackMessage && (
            <div className="alert alert-info custom-alert" role="alert">
              {feedbackMessage}
            </div>
          )}

          <div className="mt-3">
            <button type="submit" className="btn btn-success">
              Submit
            </button>
          </div>
        </form>
      </div>

      {/* Speed Controls Section */}
      <div className="textform-card">
        <h2 className="section-title">Custom Speed Configuration</h2>
        <p className="section-subtitle">
          Adjust your custom reading and typing speeds to update statistics and comparative charts in real time.
        </p>

        <div className="row g-3">
          <div className="col-md-6">
            <div className="speed-control-box">
              <label htmlFor="readingSpeedInput" className="form-label">
                Custom Reading Speed (Words Per Minute)
              </label>
              <input
                type="number"
                className="form-control"
                id="readingSpeedInput"
                min="1"
                max="2000"
                value={readingSpeed}
                onChange={(e) => setReadingSpeed(e.target.value)}
                placeholder="130"
              />
              <small className="text-muted d-block mt-1">
                Standard Average Benchmark: 130 WPM
              </small>
            </div>
          </div>

          <div className="col-md-6">
            <div className="speed-control-box">
              <label htmlFor="typingSpeedInput" className="form-label">
                Custom Typing Speed (Words Per Minute)
              </label>
              <input
                type="number"
                className="form-control"
                id="typingSpeedInput"
                min="1"
                max="500"
                value={typingSpeed}
                onChange={(e) => setTypingSpeed(e.target.value)}
                placeholder="60"
              />
              <small className="text-muted d-block mt-1">
                Standard Average Benchmark: 60 WPM
              </small>
            </div>
          </div>
        </div>
      </div>

      {/* Facts & Statistics Section */}
      <div className="row g-4">
        {/* Reading Facts Container (5 Structured Metrics) */}
        <div className="col-lg-6">
          <div className="facts-container">
            <h2 className="section-title">Reading Facts & Metrics</h2>
            <p className="section-subtitle">
              Calculated metrics for the active text in your message box based on reading speed.
            </p>

            <div className="facts-grid">
              {/* Metric 1 */}
              <div className="metric-card">
                <div className="metric-title">Current Custom Speed</div>
                <div className="metric-value user-metric">{numReadingSpeed} WPM</div>
                <p className="metric-desc">Configured reading rate</p>
              </div>

              {/* Metric 2 */}
              <div className="metric-card">
                <div className="metric-title">Average Benchmark Speed</div>
                <div className="metric-value benchmark-metric">130 WPM</div>
                <p className="metric-desc">Standard adult average</p>
              </div>

              {/* Metric 3 */}
              <div className="metric-card">
                <div className="metric-title">Active Word Count</div>
                <div className="metric-value neutral-metric">{wordCount}</div>
                <p className="metric-desc">{charCount} total characters</p>
              </div>

              {/* Metric 4 */}
              <div className="metric-card">
                <div className="metric-title">Calculated Reading Time</div>
                <div className="metric-value user-metric">{formatTimeMinutes(userReadingMinutes)}</div>
                <p className="metric-desc">At {numReadingSpeed} WPM custom rate</p>
              </div>

              {/* Metric 5 */}
              <div className="metric-card">
                <div className="metric-title">Benchmark Reading Time</div>
                <div className="metric-value benchmark-metric">{formatTimeMinutes(benchmarkReadingMinutes)}</div>
                <p className="metric-desc">At 130 WPM benchmark rate</p>
              </div>
            </div>
          </div>
        </div>

        {/* Typing Facts Container (5 Structured Metrics) */}
        <div className="col-lg-6">
          <div className="facts-container">
            <h2 className="section-title">Typing Facts & Metrics</h2>
            <p className="section-subtitle">
              Calculated metrics for the active text in your message box based on typing speed.
            </p>

            <div className="facts-grid">
              {/* Metric 1 */}
              <div className="metric-card">
                <div className="metric-title">Custom Typing Speed</div>
                <div className="metric-value user-metric">{numTypingSpeed} WPM</div>
                <p className="metric-desc">Configured typing rate</p>
              </div>

              {/* Metric 2 */}
              <div className="metric-card">
                <div className="metric-title">Average Benchmark Speed</div>
                <div className="metric-value benchmark-metric">60 WPM</div>
                <p className="metric-desc">Standard professional rate</p>
              </div>

              {/* Metric 3 */}
              <div className="metric-card">
                <div className="metric-title">Active Word Count</div>
                <div className="metric-value neutral-metric">{wordCount}</div>
                <p className="metric-desc">{charCount} total characters</p>
              </div>

              {/* Metric 4 */}
              <div className="metric-card">
                <div className="metric-title">Calculated Typing Time</div>
                <div className="metric-value user-metric">{formatTimeMinutes(userTypingMinutes)}</div>
                <p className="metric-desc">At {numTypingSpeed} WPM custom rate</p>
              </div>

              {/* Metric 5 */}
              <div className="metric-card">
                <div className="metric-title">Benchmark Time & Speed Difference</div>
                <div className="metric-value benchmark-metric">
                  {formatTimeMinutes(benchmarkTypingMinutes)}
                </div>
                <p className="metric-desc">
                  Difference: {typingSpeedDiff > 0 ? `+${typingSpeedDiff}` : typingSpeedDiff} WPM vs benchmark
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>

      {/* Live Dynamic Charts Section */}
      <div className="row g-4">
        {/* Reading Time Comparison Chart */}
        <div className="col-lg-6">
          <div className="chart-container-card">
            <h2 className="section-title">Reading Time Comparison Chart</h2>
            <p className="section-subtitle">
              Comparison across standard word milestones (500 to 5000 words): Average Human Benchmark (130 WPM) vs. Custom Speed ({numReadingSpeed} WPM).
            </p>
            <div className="chart-canvas-wrapper">
              <Line data={readingChartData} options={getChartOptions('Reading Time Comparison')} />
            </div>
          </div>
        </div>

        {/* Typing Time Comparison Chart */}
        <div className="col-lg-6">
          <div className="chart-container-card">
            <h2 className="section-title">Typing Time Comparison Chart</h2>
            <p className="section-subtitle">
              Comparison across standard word milestones (500 to 5000 words): Average Benchmark (60 WPM) vs. Custom Speed ({numTypingSpeed} WPM).
            </p>
            <div className="chart-canvas-wrapper">
              <Line data={typingChartData} options={getChartOptions('Typing Time Comparison')} />
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

TextForm.propTypes = {
  heading: PropTypes.string,
  emailLabel: PropTypes.string,
  text: PropTypes.string
};

TextForm.defaultProps = {
  heading: 'Contact Us',
  emailLabel: 'Your Email',
  text: 'Your Message'
};